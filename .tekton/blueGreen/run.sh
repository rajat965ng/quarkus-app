#!/bin/sh
api_server=https://api.cdacpoc01.dcservices.in:6443
namespace=eppms

echo "---------------Login-------------"
oc login --token=$(oc whoami -t)  --server=$api_server
echo "switch context to eppms"
oc project $namespace
oc delete -f ./eppms-pipeline.yaml
oc delete -f ./mavenpipeline.yaml
sleep 5
echo "Deploy Pipeline"
oc apply -f ./mavenpipeline.yaml
echo "Deploy PipelineRun"
oc apply -f ./eppms-pipeline.yaml