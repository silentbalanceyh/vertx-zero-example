#!/usr/bin/env bash
rm -rf ${PWD}/_book/*
img_name="book"
container_name=ox_${img_name}

docker stop ${container_name}
docker rm ${container_name}
docker rmi ${img_name}:latest

docker build -t ${img_name}:latest -f docker/book-init .
docker run \
    -v ${PWD}:/srv/gitbook \
    -v ${PWD}/_book:/srv/html \
    -p 1231:4000 \
    --name ${container_name} \
    ${img_name} \
    gitbook build . /srv/html
