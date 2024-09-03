#!bin/bash

read -p "Enter full docker repository image with tag: " docker_repository
docker pull $docker_repository
echo "Successfully pulled docker repository!"
echo "Running docker image"
echo "Here are the docker images in this environment"
docker images
docker compose up