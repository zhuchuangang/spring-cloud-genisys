docker pull openzipkin/zipkin-mysql:1.37.0
docker pull openzipkin/zipkin-web:1.37.0

docker run -d -p 8081:8080 -p 9991:9990 --name="zipkin-web" -e "QUERY_PORT_9411_TCP_ADDR=20.20.20.174" openzipkin/zipkin-web:1.37.0