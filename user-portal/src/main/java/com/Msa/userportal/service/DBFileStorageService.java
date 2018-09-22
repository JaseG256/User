package com.Msa.userportal.service;

import com.Msa.userportal.model.DBFile;
import org.springframework.web.multipart.MultipartFile;

public interface DBFileStorageService {

    DBFile storeFile(MultipartFile file);

    DBFile getFile(String fileId);
}
