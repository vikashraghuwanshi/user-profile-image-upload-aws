package com.vikash.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("aws-react-boot-image-upload");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
