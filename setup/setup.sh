cd docker
docker-compose -f docker-compose.yml up
docker cp init.sql mysql:init.sql
docker exec -it mysql sh -c 'exec mysql -uroot -p "qwe1212!Q" < init.sql'