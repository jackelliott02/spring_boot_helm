# spring_boot_helm

## Instructions

The following guide shows how to get Jenkins deploying this appplication as part of the Dinner and DevOps web series.

### Preparation

**Update your cluster service accounts**

This allows us to run kubectl/helm commands within containers on the cluster.

```
kubectl create clusterrolebinding permissive-binding --clusterrole=cluster-admin --user=admin --user=kubelet --group=system:serviceaccounts
```

**Update Jenkins with your AWS credentials**

Open up Jenkins in your browser. On the main page Jenkins homepage click **Credentials**

In the credentials page, click the **global** to store some credentials locally.

Once loaded clicked **Add Credentials**

In the subsequent form, choose **AWS Credentials** from the **Kind** drop down

For the **ID** enter **aws-access** this maps to the value shown in the [Jenkinsfile](./Jenkinsfile)

You can leave description blank

For the **Access Key ID** and **Secret Access Key** enter the values from your terraform credentials.

You can retrieve these by doing `cat ~/.aws/credentials`