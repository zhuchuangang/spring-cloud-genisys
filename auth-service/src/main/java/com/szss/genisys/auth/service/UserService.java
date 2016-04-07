package com.szss.genisys.auth.service;

import com.szss.commons.security.CustomGrantedAuthority;
import com.szss.commons.security.UserInfoDetails;
import com.szss.genisys.auth.domain.authority.Authority;
import com.szss.genisys.auth.domain.authority.AuthorityRepository;
import com.szss.genisys.auth.domain.user.User;
import com.szss.genisys.auth.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import rx.Observable;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zcg on 16/3/16.
 */
@Service
public class UserService implements UserDetailsService{
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AuthorityRepository authorityRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //获取用户
        User user=userRepository.findByUsername(username);
        if (user == null || user.getDeleted()) {
            throw new UsernameNotFoundException("Not found any user for username[" + username + "]");
        }
        //获取用户权限
        List<Authority> authorities=authorityRepository.findByUserId(user.getId());
        final List<CustomGrantedAuthority> customGrantedAuthorities=new ArrayList<CustomGrantedAuthority>();
        Observable.from(authorities).subscribe(auth -> customGrantedAuthorities.add(new CustomGrantedAuthority(auth.getAuthority())));
        UserInfoDetails userInfoDetails=new UserInfoDetails(user.getId(),user.getUsername(),user.getPassword(),user.getEnabled(),customGrantedAuthorities);
        return userInfoDetails;
    }

    public Page<User> findAll(String name, String username, int page, int size){
        PageRequest pageRequest=new PageRequest(page,size);
        return userRepository.findAll((Root<User> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) -> {
                Path<String> namePath = root.get("name");
                Path<String> usernamePath = root.get("username");
                List<Predicate> predicates=new ArrayList<>();
                if (!StringUtils.isEmpty(name)){
                    predicates.add(criteriaBuilder.like(namePath,name+"%"));
                }
                if (!StringUtils.isEmpty(username)){
                    predicates.add(criteriaBuilder.like(usernamePath,username+"%"));
                }
                criteriaQuery.where(predicates.toArray(new Predicate[predicates.size()]));
                return null;
            },pageRequest);
    }

    public void add(String username,String name,String phone,Boolean enabled){
        User user = new User();
        user.setName(name);
        user.setUsername(username);
        userRepository.save(user);
    }
}
