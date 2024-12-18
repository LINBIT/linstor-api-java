#!/bin/bash

set -e

echo "please execute in linstor-api-java"

LINSTOR_DIR=$PWD/../linstor-server

SWAGGER_VERSION=3.0.64

docker pull swaggerapi/swagger-codegen-cli-v3:$SWAGGER_VERSION

docker run -it --rm \
	-v $LINSTOR_DIR:/linstor \
	-v $PWD:/tmp/gen swaggerapi/swagger-codegen-cli-v3:$SWAGGER_VERSION \
	generate -l java -i /linstor/docs/rest_v1_openapi.yaml -o /tmp/gen/ \
	--invoker-package com.linbit.linstor.api \
	--api-package com.linbit.linstor.api \
	--model-package com.linbit.linstor.api.model \
    --artifact-id "java-linstor" \
    --group-id com.linbit.linstor.api \
	-DdateLibrary=java8 \
	--library jersey2
#	-DartifactDescription="Linstor java client library" \

sudo chown -R $USER:$USER $PWD

sed -i 's/^ \* Linstor REST API V1  The.*/ \*/g' $PWD/src/main/java/com/linbit/linstor/api/model/*.java \
  $PWD/src/main/java/com/linbit/linstor/api/auth/*.java $PWD/src/main/java/com/linbit/linstor/api/*.java

git apply patches/*.diff
