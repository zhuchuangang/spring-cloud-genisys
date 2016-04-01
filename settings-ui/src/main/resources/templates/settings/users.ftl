<#assign base="../webjars/adminlte/2.3.2"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>AdminSettings</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="${base}/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="../ionicons/2.0.1/css/ionicons.min.css">
    <!-- DataTables -->
    <link rel="stylesheet" href="${base}/plugins/datatables/dataTables.bootstrap.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="${base}/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. Choose a skin from the css/skins
         folder instead of downloading all of them to reduce the load. -->
    <link rel="stylesheet" href="${base}/dist/css/skins/_all-skins.min.css">
    <!-- Pace style -->
    <link rel="stylesheet" href="${base}/plugins/pace/pace.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="../html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="../respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body class="hold-transition skin-blue sidebar-mini">
<!-- Site wrapper -->
<div class="wrapper">

    <header class="main-header">
        <!-- Logo -->
        <a href="${base}/index2.html" class="logo">
            <!-- mini logo for sidebar mini 50x50 pixels -->
            <span class="logo-mini"><b>A</b>ST</span>
            <!-- logo for regular state and mobile devices -->
            <span class="logo-lg"><b>Admin</b>Settings</span>
        </a>
        <!-- Header Navbar: style can be found in header.less -->
        <nav class="navbar navbar-static-top" role="navigation">
            <!-- Sidebar toggle button-->
            <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </a>

            <div class="navbar-custom-menu">
                <ul class="nav navbar-nav">
                    <!-- Messages: style can be found in dropdown.less-->
                    <#--<li class="dropdown messages-menu">-->
                        <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown">-->
                            <#--<i class="fa fa-envelope-o"></i>-->
                            <#--<span class="label label-success">4</span>-->
                        <#--</a>-->
                        <#--<ul class="dropdown-menu">-->
                            <#--<li class="header">You have 4 messages</li>-->
                            <#--<li>-->
                                <#--<!-- inner menu: contains the actual data &ndash;&gt;-->
                                <#--<ul class="menu">-->
                                    <#--<li><!-- start message &ndash;&gt;-->
                                        <#--<a href="#">-->
                                            <#--<div class="pull-left">-->
                                                <#--<img src="${base}/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">-->
                                            <#--</div>-->
                                            <#--<h4>-->
                                                <#--Support Team-->
                                                <#--<small><i class="fa fa-clock-o"></i> 5 mins</small>-->
                                            <#--</h4>-->
                                            <#--<p>Why not buy a new awesome theme?</p>-->
                                        <#--</a>-->
                                    <#--</li>-->
                                    <#--<!-- end message &ndash;&gt;-->
                                <#--</ul>-->
                            <#--</li>-->
                            <#--<li class="footer"><a href="#">See All Messages</a></li>-->
                        <#--</ul>-->
                    <#--</li>-->
                    <!-- Notifications: style can be found in dropdown.less -->
                    <#--<li class="dropdown notifications-menu">-->
                        <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown">-->
                            <#--<i class="fa fa-bell-o"></i>-->
                            <#--<span class="label label-warning">10</span>-->
                        <#--</a>-->
                        <#--<ul class="dropdown-menu">-->
                            <#--<li class="header">You have 10 notifications</li>-->
                            <#--<li>-->
                                <#--<!-- inner menu: contains the actual data &ndash;&gt;-->
                                <#--<ul class="menu">-->
                                    <#--<li>-->
                                        <#--<a href="#">-->
                                            <#--<i class="fa fa-users text-aqua"></i> 5 new members joined today-->
                                        <#--</a>-->
                                    <#--</li>-->
                                <#--</ul>-->
                            <#--</li>-->
                            <#--<li class="footer"><a href="#">View all</a></li>-->
                        <#--</ul>-->
                    <#--</li>-->
                    <!-- Tasks: style can be found in dropdown.less -->
                    <#--<li class="dropdown tasks-menu">-->
                        <#--<a href="#" class="dropdown-toggle" data-toggle="dropdown">-->
                            <#--<i class="fa fa-flag-o"></i>-->
                            <#--<span class="label label-danger">9</span>-->
                        <#--</a>-->
                        <#--<ul class="dropdown-menu">-->
                            <#--<li class="header">You have 9 tasks</li>-->
                            <#--<li>-->
                                <#--<!-- inner menu: contains the actual data &ndash;&gt;-->
                                <#--<ul class="menu">-->
                                    <#--<li><!-- Task item &ndash;&gt;-->
                                        <#--<a href="#">-->
                                            <#--<h3>-->
                                                <#--Design some buttons-->
                                                <#--<small class="pull-right">20%</small>-->
                                            <#--</h3>-->
                                            <#--<div class="progress xs">-->
                                                <#--<div class="progress-bar progress-bar-aqua" style="width: 20%" role="progressbar" aria-valuenow="20" aria-valuemin="0" aria-valuemax="100">-->
                                                    <#--<span class="sr-only">20% Complete</span>-->
                                                <#--</div>-->
                                            <#--</div>-->
                                        <#--</a>-->
                                    <#--</li>-->
                                    <#--<!-- end task item &ndash;&gt;-->
                                <#--</ul>-->
                            <#--</li>-->
                            <#--<li class="footer">-->
                                <#--<a href="#">View all tasks</a>-->
                            <#--</li>-->
                        <#--</ul>-->
                    <#--</li>-->
                    <!-- User Account: style can be found in dropdown.less -->


                    <li class="dropdown user user-menu">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                            <img src="${base}/dist/img/user2-160x160.jpg" class="user-image" alt="User Image">
                            <span class="hidden-xs">鼠笑天</span>
                        </a>
                        <ul class="dropdown-menu">
                            <!-- User image -->
                            <li class="user-header">
                                <img src="${base}/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">

                                <p>
                                    鼠笑天 - Web Developer
                                    <small>Member since Nov. 2012</small>
                                </p>
                            </li>
                            <!-- Menu Body -->
                            <li class="user-body">
                                <#--<div class="row">-->
                                    <#--<div class="col-xs-4 text-center">-->
                                        <#--<a href="#">Followers</a>-->
                                    <#--</div>-->
                                    <#--<div class="col-xs-4 text-center">-->
                                        <#--<a href="#">Sales</a>-->
                                    <#--</div>-->
                                    <#--<div class="col-xs-4 text-center">-->
                                        <#--<a href="#">Friends</a>-->
                                    <#--</div>-->
                                <#--</div>-->
                                <!-- /.row -->
                            </li>
                            <!-- Menu Footer-->
                            <li class="user-footer">
                                <#--<div class="pull-left">-->
                                    <#--<a href="#" class="btn btn-default btn-flat">Profile</a>-->
                                <#--</div>-->
                                <div class="pull-right">
                                    <a href="#" class="btn btn-default btn-flat">退出</a>
                                </div>
                            </li>
                        </ul>
                    </li>
                    <!-- Control Sidebar Toggle Button -->
                    <li>
                        <a href="#" data-toggle="control-sidebar"><i class="fa fa-gears"></i></a>
                    </li>
                </ul>
            </div>
        </nav>
    </header>

    <!-- =============================================== -->

    <!-- Left side column. contains the sidebar -->
    <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
            <!-- Sidebar user panel -->
            <div class="user-panel">
                <div class="pull-left image">
                    <img src="${base}/dist/img/user2-160x160.jpg" class="img-circle" alt="User Image">
                </div>
                <div class="pull-left info">
                    <p>鼠笑天</p>
                    <a href="#"><i class="fa fa-circle text-success"></i>在线</a>
                </div>
            </div>
            <!-- search form -->
            <form action="#" method="get" class="sidebar-form">
                <div class="input-group">
                    <input type="text" name="q" class="form-control" placeholder="搜索...">
              <span class="input-group-btn">
                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
                </button>
              </span>
                </div>
            </form>
            <!-- /.search form -->
            <#--主菜单-->
            <!-- sidebar menu: : style can be found in sidebar.less -->
            <ul class="sidebar-menu">
                <li class="header">内容导航</li>
                <li class="treeview">
                    <a href="#">
                        <i class="fa fa-dashboard"></i> <span>Dashboard</span> <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li><a href="${base}/index.html"><i class="fa fa-circle-o"></i> Dashboard v1</a></li>
                        <li><a href="${base}/index2.html"><i class="fa fa-circle-o"></i> Dashboard v2</a></li>
                    </ul>
                </li>
                <li class="treeview active">
                    <a href="#">
                        <i class="fa fa-pie-chart"></i>
                        <span>系统设置</span>
                        <i class="fa fa-angle-left pull-right"></i>
                    </a>
                    <ul class="treeview-menu">
                        <li class="active"><a href="settings/users"><i class="fa fa-circle-o"></i>用户管理</a></li>
                    </ul>
                </li>
                <#--<li class="treeview">-->
                    <#--<a href="#">-->
                        <#--<i class="fa fa-laptop"></i>-->
                        <#--<span>UI Elements</span>-->
                        <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</a>-->
                    <#--<ul class="treeview-menu">-->
                        <#--<li><a href="${base}/UI/general.html"><i class="fa fa-circle-o"></i> General</a></li>-->
                        <#--<li><a href="${base}/UI/icons.html"><i class="fa fa-circle-o"></i> Icons</a></li>-->
                        <#--<li><a href="${base}/UI/buttons.html"><i class="fa fa-circle-o"></i> Buttons</a></li>-->
                        <#--<li><a href="${base}/UI/sliders.html"><i class="fa fa-circle-o"></i> Sliders</a></li>-->
                        <#--<li><a href="${base}/UI/timeline.html"><i class="fa fa-circle-o"></i> Timeline</a></li>-->
                        <#--<li><a href="${base}/UI/modals.html"><i class="fa fa-circle-o"></i> Modals</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li class="treeview">-->
                    <#--<a href="#">-->
                        <#--<i class="fa fa-edit"></i> <span>Forms</span>-->
                        <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</a>-->
                    <#--<ul class="treeview-menu">-->
                        <#--<li><a href="${base}/forms/general.html"><i class="fa fa-circle-o"></i> General Elements</a></li>-->
                        <#--<li><a href="${base}/forms/advanced.html"><i class="fa fa-circle-o"></i> Advanced Elements</a></li>-->
                        <#--<li><a href="${base}/forms/editors.html"><i class="fa fa-circle-o"></i> Editors</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li class="treeview">-->
                    <#--<a href="#">-->
                        <#--<i class="fa fa-table"></i> <span>Tables</span>-->
                        <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</a>-->
                    <#--<ul class="treeview-menu">-->
                        <#--<li><a href="${base}/tables/simple.html"><i class="fa fa-circle-o"></i> Simple tables</a></li>-->
                        <#--<li><a href="${base}/tables/data.html"><i class="fa fa-circle-o"></i> Data tables</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<a href="${base}/calendar.html">-->
                        <#--<i class="fa fa-calendar"></i> <span>Calendar</span>-->
                        <#--<small class="label pull-right bg-red">3</small>-->
                    <#--</a>-->
                <#--</li>-->
                <#--<li>-->
                    <#--<a href="${base}/mailbox/mailbox.html">-->
                        <#--<i class="fa fa-envelope"></i> <span>Mailbox</span>-->
                        <#--<small class="label pull-right bg-yellow">12</small>-->
                    <#--</a>-->
                <#--</li>-->
                <#--<li class="treeview active">-->
                    <#--<a href="#">-->
                        <#--<i class="fa fa-folder"></i> <span>Examples</span>-->
                        <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</a>-->
                    <#--<ul class="treeview-menu">-->
                        <#--<li><a href="invoice.html"><i class="fa fa-circle-o"></i> Invoice</a></li>-->
                        <#--<li><a href="profile.html"><i class="fa fa-circle-o"></i> Profile</a></li>-->
                        <#--<li><a href="login.html"><i class="fa fa-circle-o"></i> Login</a></li>-->
                        <#--<li><a href="register.html"><i class="fa fa-circle-o"></i> Register</a></li>-->
                        <#--<li><a href="lockscreen.html"><i class="fa fa-circle-o"></i> Lockscreen</a></li>-->
                        <#--<li><a href="404.html"><i class="fa fa-circle-o"></i> 404 Error</a></li>-->
                        <#--<li><a href="500.html"><i class="fa fa-circle-o"></i> 500 Error</a></li>-->
                        <#--<li><a href="blank.html"><i class="fa fa-circle-o"></i> Blank Page</a></li>-->
                        <#--<li class="active"><a href="pace.html"><i class="fa fa-circle-o"></i> Pace Page</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li class="treeview">-->
                    <#--<a href="#">-->
                        <#--<i class="fa fa-share"></i> <span>Multilevel</span>-->
                        <#--<i class="fa fa-angle-left pull-right"></i>-->
                    <#--</a>-->
                    <#--<ul class="treeview-menu">-->
                        <#--<li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>-->
                        <#--<li>-->
                            <#--<a href="#"><i class="fa fa-circle-o"></i> Level One <i class="fa fa-angle-left pull-right"></i></a>-->
                            <#--<ul class="treeview-menu">-->
                                <#--<li><a href="#"><i class="fa fa-circle-o"></i> Level Two</a></li>-->
                                <#--<li>-->
                                    <#--<a href="#"><i class="fa fa-circle-o"></i> Level Two <i class="fa fa-angle-left pull-right"></i></a>-->
                                    <#--<ul class="treeview-menu">-->
                                        <#--<li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>-->
                                        <#--<li><a href="#"><i class="fa fa-circle-o"></i> Level Three</a></li>-->
                                    <#--</ul>-->
                                <#--</li>-->
                            <#--</ul>-->
                        <#--</li>-->
                        <#--<li><a href="#"><i class="fa fa-circle-o"></i> Level One</a></li>-->
                    <#--</ul>-->
                <#--</li>-->
                <#--<li><a href="${base}/documentation/index.html"><i class="fa fa-book"></i> <span>Documentation</span></a></li>-->
                <#--<li class="header">LABELS</li>-->
                <#--<li><a href="#"><i class="fa fa-circle-o text-red"></i> <span>Important</span></a></li>-->
                <#--<li><a href="#"><i class="fa fa-circle-o text-yellow"></i> <span>Warning</span></a></li>-->
                <#--<li><a href="#"><i class="fa fa-circle-o text-aqua"></i> <span>Information</span></a></li>-->
            </ul>
        </section>
        <!-- /.sidebar -->
    </aside>

    <!-- =============================================== -->
    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                用户管理
                <small>用户查询列表</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li><a href="#">系统设置</a></li>
                <li class="active">用户管理</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">

                    <div class="box">
                        <div class="box-header">
                            <div class="box-tools pull-right">
                                <button id="users-add" type="button" class="btn btn-box-tool" data-toggle="tooltip" title="新增">
                                    <i class="fa fa-plus"></i>
                                </button>
                                <button id="users-edit" type="button" class="btn btn-box-tool" data-toggle="tooltip" title="修改">
                                    <i class="fa fa-edit"></i>
                                </button>
                                <button id="users-remove" type="button" class="btn btn-box-tool" data-toggle="tooltip" title="删除">
                                    <i class="fa fa-remove"></i>
                                </button>
                            </div>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">
                            <!-- search star -->
                            <div class="form-horizontal clearfix">
                                <div class="form-group">
                                    <div class="col-lg-3 col-sm-3 form-group">
                                        <label class="col-lg-4 col-sm-4 control-label" for="username">用户名</label>
                                        <div class="col-lg-8 col-sm-8 input-group">
                                            <input name="username" type="text" placeholder="请输入用户名"
                                                   class="input-sm form-control">
                                        </div>
                                    </div>
                                    <div class="col-lg-3 col-sm-3 form-group">
                                        <label class="col-lg-4 col-sm-4  control-label" for="name">姓名</label>
                                        <div class="col-lg-8 col-sm-8 input-group">
                                            <input name="name" type="text" placeholder="请输入姓名"
                                                   class="input-sm form-control">
                                        </div>
                                    </div>
                                    <span class="col-lg-3 col-sm-3 input-group-btn">
                                        <button id="users-search-btn" type="button" class="btn btn-sm btn-primary">搜索</button>
                                    </span>
                                </div>
                            </div>

                            <table class="table table-bordered table-striped bootstrap-datatable datatable">
                                <#--table table-striped table-bordered bootstrap-datatable datatable-->
                                <thead>
                                <tr>
                                    <th><input name="table-check-all" type="checkbox"></th>
                                    <th>用户名</th>
                                    <th>姓名</th>
                                    <th>手机号</th>
                                    <th>是否可用</th>
                                    <th>注册时间</th>
                                    <th>更新时间</th>
                                </tr>
                                </thead>
                            </table>
                        </div>
                        <!-- /.box-body -->
                    </div>
                    <!-- /.box -->
                </div>
                <!-- /.col -->
            </div>
            <!-- /.row -->
        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->


    <footer class="main-footer">
        <div class="pull-right hidden-xs">
            <b>Version</b> 1.0.0
        </div>
        <strong>Copyright &copy; 2012-2016 <a href="http://www.3songshu.com">三只松鼠</a>.</strong> All rights
        reserved.
    </footer>

    <!-- Control Sidebar -->
    <aside class="control-sidebar control-sidebar-dark">
        <!-- Create the tabs -->
        <ul class="nav nav-tabs nav-justified control-sidebar-tabs">
            <li><a href="#control-sidebar-home-tab" data-toggle="tab"><i class="fa fa-home"></i></a></li>

            <#--<li><a href="#control-sidebar-settings-tab" data-toggle="tab"><i class="fa fa-gears"></i></a></li>-->
        </ul>
        <!-- Tab panes -->
        <div class="tab-content">
            <!-- Home tab content -->
            <div class="tab-pane" id="control-sidebar-home-tab">
                <#--<h3 class="control-sidebar-heading">Recent Activity</h3>-->
                <#--<ul class="control-sidebar-menu">-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<i class="menu-icon fa fa-birthday-cake bg-red"></i>-->

                            <#--<div class="menu-info">-->
                                <#--<h4 class="control-sidebar-subheading">Langdon's Birthday</h4>-->

                                <#--<p>Will be 23 on April 24th</p>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<i class="menu-icon fa fa-user bg-yellow"></i>-->

                            <#--<div class="menu-info">-->
                                <#--<h4 class="control-sidebar-subheading">Frodo Updated His Profile</h4>-->

                                <#--<p>New phone +1(800)555-1234</p>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<i class="menu-icon fa fa-envelope-o bg-light-blue"></i>-->

                            <#--<div class="menu-info">-->
                                <#--<h4 class="control-sidebar-subheading">Nora Joined Mailing List</h4>-->

                                <#--<p>nora@example.com</p>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<i class="menu-icon fa fa-file-code-o bg-green"></i>-->

                            <#--<div class="menu-info">-->
                                <#--<h4 class="control-sidebar-subheading">Cron Job 254 Executed</h4>-->

                                <#--<p>Execution time 5 seconds</p>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                <#--</ul>-->
                <!-- /.control-sidebar-menu -->

                <#--<h3 class="control-sidebar-heading">Tasks Progress</h3>-->
                <#--<ul class="control-sidebar-menu">-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<h4 class="control-sidebar-subheading">-->
                                <#--Custom Template Design-->
                                <#--<span class="label label-danger pull-right">70%</span>-->
                            <#--</h4>-->

                            <#--<div class="progress progress-xxs">-->
                                <#--<div class="progress-bar progress-bar-danger" style="width: 70%"></div>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<h4 class="control-sidebar-subheading">-->
                                <#--Update Resume-->
                                <#--<span class="label label-success pull-right">95%</span>-->
                            <#--</h4>-->

                            <#--<div class="progress progress-xxs">-->
                                <#--<div class="progress-bar progress-bar-success" style="width: 95%"></div>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<h4 class="control-sidebar-subheading">-->
                                <#--Laravel Integration-->
                                <#--<span class="label label-warning pull-right">50%</span>-->
                            <#--</h4>-->

                            <#--<div class="progress progress-xxs">-->
                                <#--<div class="progress-bar progress-bar-warning" style="width: 50%"></div>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                    <#--<li>-->
                        <#--<a href="javascript::;">-->
                            <#--<h4 class="control-sidebar-subheading">-->
                                <#--Back End Framework-->
                                <#--<span class="label label-primary pull-right">68%</span>-->
                            <#--</h4>-->

                            <#--<div class="progress progress-xxs">-->
                                <#--<div class="progress-bar progress-bar-primary" style="width: 68%"></div>-->
                            <#--</div>-->
                        <#--</a>-->
                    <#--</li>-->
                <#--</ul>-->
                <!-- /.control-sidebar-menu -->

            </div>
            <!-- /.tab-pane -->
            <!-- Stats tab content -->
            <#--<div class="tab-pane" id="control-sidebar-stats-tab">Stats Tab Content</div>-->
            <!-- /.tab-pane -->
            <!-- Settings tab content -->
            <#--<div class="tab-pane" id="control-sidebar-settings-tab">-->
                <#--<form method="post">-->
                    <#--<h3 class="control-sidebar-heading">General Settings</h3>-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Report panel usage-->
                            <#--<input type="checkbox" class="pull-right" checked>-->
                        <#--</label>-->

                        <#--<p>-->
                            <#--Some information about this general settings option-->
                        <#--</p>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Allow mail redirect-->
                            <#--<input type="checkbox" class="pull-right" checked>-->
                        <#--</label>-->

                        <#--<p>-->
                            <#--Other sets of options are available-->
                        <#--</p>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Expose author name in posts-->
                            <#--<input type="checkbox" class="pull-right" checked>-->
                        <#--</label>-->

                        <#--<p>-->
                            <#--Allow the user to show his name in blog posts-->
                        <#--</p>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->

                    <#--<h3 class="control-sidebar-heading">Chat Settings</h3>-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Show me as online-->
                            <#--<input type="checkbox" class="pull-right" checked>-->
                        <#--</label>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Turn off notifications-->
                            <#--<input type="checkbox" class="pull-right">-->
                        <#--</label>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->

                    <#--<div class="form-group">-->
                        <#--<label class="control-sidebar-subheading">-->
                            <#--Delete chat history-->
                            <#--<a href="javascript::;" class="text-red pull-right"><i class="fa fa-trash-o"></i></a>-->
                        <#--</label>-->
                    <#--</div>-->
                    <#--<!-- /.form-group &ndash;&gt;-->
                <#--</form>-->
            <#--</div>-->
            <!-- /.tab-pane -->
        </div>
    </aside>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- jQuery 2.1.4 -->
<script src="${base}/plugins/jQuery/jQuery-2.1.4.min.js"></script>
<!-- Bootstrap 3.3.5 -->
<script src="${base}/bootstrap/js/bootstrap.min.js"></script>
<!-- PACE -->
<script src="${base}/plugins/pace/pace.min.js"></script>
<!-- DataTables -->
<script src="${base}/plugins/datatables/jquery.dataTables.min.js"></script>
<script src="${base}/plugins/datatables/dataTables.bootstrap.min.js"></script>
<!-- SlimScroll -->
<script src="${base}/plugins/slimScroll/jquery.slimscroll.min.js"></script>
<!-- FastClick -->
<script src="${base}/plugins/fastclick/fastclick.js"></script>
<!-- AdminLTE App -->
<script src="${base}/dist/js/app.min.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="${base}/dist/js/demo.js"></script>
<!-- page script -->
<script type="text/javascript">
    // To make Pace works on Ajax calls
    $(document).ajaxStart(function() { Pace.restart(); });

    $(function () {

        var table = $('.table').dataTable({
            "loadingRecords": "正在加载数据...",
            "zeroRecords": "暂无数据",
            "dom": "<'row-fluid'r>t<<'row-fluid'<'span3'i><'offset7 span2'l>><'span12 pagination-centered'p>>",
            "language": {"url": "../datatables/datatables-cn-zh.json"},
            "ordering": false,
            "searching": false,
            "processing": true,
            "serverSide": true,
            "serverMethod": "GET",
            "ajax": "users?method=settings.users.queryall",
            "fnServerParams": function (data) {
                planify(data);
            },
            "fnServerParams": function (data) {
                $(":checkbox[name='table-check-all']").attr("checked","false");
                planify(data);
                if ($(":checkbox[name='table-check-all']").attr("checked") == "checked") {
                    $(":checkbox[name='table-check-all']").click();
                }
            },
            "columns": [
                {"data": "id"},
                {"data": "username"},
                {"data": "name"},
                {"data": "phone"},
                {"data": "enabled"},
                {"data": "dateCreated"},
                {"data": "lastUpdated"}
            ],
            "columnDefs": [
                {
                    "render": function (data, type, row) {
                        return "<input name='table-check' type='checkbox' value='" + data + "'>";
                    },
                    "targets": 0
                },
                {
                    "render": function (data, type, row) {
                        if (data == true)
                            return "<span class='label label-success'>可用</span>";
                        else
                            return "<span class='label label-danger'>不可用</span>";
                    },
                    "targets": 4
                }
            ]
        });

        $("#users-search-btn").click(function () {
            table.fnDraw();
        });

        $("#users-add").click(function(){
            window.location.href="create_user";
        });
    });


    function planify(data) {
        for (var i = 0; i < data.columns.length; i++) {
            column = data.columns[i];
            column.searchRegex = column.search.regex;
            column.searchValue = column.search.value;
            delete(column.search);
            if (column.data == "name") {
                column.searchValue = $(":input[name='name']").val();
            }
            if (column.data == "username") {
                column.searchValue = $(":input[name='username']").val();
            }
        }
    }
</script>
</body>
</html>
