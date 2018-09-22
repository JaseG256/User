package com.Msa.userportal.payload.response;

public class UploadFileResponse {

    private String fileName;
    private String uploadFileUri;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String uploadFileUri, String fileType, long size) {
        this.fileName = fileName;
        this.uploadFileUri = uploadFileUri;
        this.fileType = fileType;
        this.size = size;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getUploadFileUri() {
        return uploadFileUri;
    }

    public void setUploadFileUri(String uploadFileUri) {
        this.uploadFileUri = uploadFileUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
