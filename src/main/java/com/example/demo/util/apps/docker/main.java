package com.example.demo.util.apps.docker;


/**
 * docker为虚拟机 可以将访问的端口 映射为虚拟机中的端口
 * 如映射关系为123:6379
 * 那么访问localhost:123 等于访问虚拟机中的6379端口
 */
public class main {

    /**
     * VMware激活码 MC60H-DWHD5-H80U9-6V85M-8280D
     * 换电脑需要安装一次
     *
     * docker和虚拟机区别在于 docker不用模拟出新的内核 虚拟机需要模拟出全新的内核
     * docker携带需要的依赖和运行的系统函数等 打包成为隔离的容器运行
     * 镜像是静态的 容器是实时运行的
     * docker 可以使用数据卷 实现容器和数据的分离
     *
     * 虚拟机ip地址  ip addr 192.168.184.128
     *
     * docker images
     * docker ps -a  -a可以查看所有容器 包括已经停止的容器
     * docker load -i xxx  加载包为镜像
     * docker run --name my_container -p 80:80 -v html:/usr/share/nginx/html -d nginx
     * -v指定数据卷挂载
     * -d deamon指定后台运行
     * -p指定端口
     * --name指定容器名
     * nginx指定运行的镜像名称
     *
     * docker logs -f my_container   -f代表实时更新
     * docker start my_container
     * 使用 docker stop，因为它允许容器执行清理操作，但在某些情况下，可能需要使用 docker kill 来强制终止容器。
     * docker exec -it myredis bash  使用命令行进入容器中
     * docker exec -it myredis redis-cli 直接进行进入redis服务器
     *
     * docker inspect html
     * 可以查看名称为html的数据卷的信息
     * - docker volume create：创建数据卷
     * - docker volume ls：查看所有数据卷
     * - docker volume inspect：查看数据卷详细信息，包括关联的宿主机目录位置
     * - docker volume rm：删除指定数据卷
     * - docker volume prune：删除所有未使用的数据卷
     *
     * docker run \
     * --name mymysql \
     * -e MYSQL_ROOT_PASSWORD=123 \
     * -p 3306:3306 \
     * -v /tmp/mysql/conf/hmy.cnf:/etc/mysql/conf.d/hmy.cnf \
     * -v /tmp/mysql/data:/var/lib/mysql  \
     * -d \
     * mysql:5.7.25
     */

}
