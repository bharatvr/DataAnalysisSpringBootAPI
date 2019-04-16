echo "==================Building Data Analysis API jar==================="

mvn clean install
echo "+++++++++++++ DataAnalysisSpringBootAPI jar build complete +++++++++++++++++"


echo -en '\n\n\n'


echo "================ Deleting old docker image =============="
docker rmi -f data-analyzer:1.0.0
echo "+++++++++++++++++ Delete complete +++++++++++++++++++++++"


echo -en '\n\n\n'


echo "==================== Building docker image =============="
docker build -t docker.apple.com/gbi-fw/data-analyzer:1.0.1 .
echo "++++++++++++++++++++ Docker image build complete +++++++++++++++++++"

docker push docker.apple.com/gbi-fw/data-analyzer:1.0.1

#to run docker image locally : docker run -p 8080:8080 docker.apple.com/gbi-fw/data-analyzer:1.0.0
