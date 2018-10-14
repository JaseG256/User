package com.Msa.userportal.service;

import com.Msa.userportal.exception.FileStorageException;
import com.Msa.userportal.exception.MyFileNotFoundException;
import com.Msa.userportal.model.DBFile;
import com.Msa.userportal.repository.DBFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Service(value = "fileServicer")
public class DBFileStorageServiceImpl implements DBFileStorageService {

    @Autowired
    DBFileRepository dbFileRepository;

    @Override
    public DBFile storeFile(MultipartFile file) {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());

        try {
            if (fileName.contains("..")) {
                throw new FileStorageException("Sorry! Filename contains invalid path sequence" + fileName);
            }

            DBFile dbFile = new DBFile(fileName, file.getContentType(), file.getBytes());

            return dbFileRepository.save(dbFile);

        } catch (IOException e) {
            throw new FileStorageException("Could not store file " + fileName + ". Please try again!", e);
        }
    }

    @Override
    public DBFile getFile(String fileId) {
        return dbFileRepository.findById(fileId).
                orElseThrow(() -> new MyFileNotFoundException("File not found with id " + fileId));
    }
}
