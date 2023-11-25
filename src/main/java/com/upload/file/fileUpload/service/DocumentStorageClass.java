package com.upload.file.fileUpload.service;


import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.fileupload2.core.DiskFileItemFactory;
import org.apache.commons.fileupload2.jakarta.JakartaServletFileUpload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DocumentStorageClass {

public String setStreamDoc(HttpServletRequest httpServletRequest){

    JakartaServletFileUpload upload = servletFileUpload();

    return null;
}

public JakartaServletFileUpload servletFileUpload(){

    DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory.Builder().get();
    JakartaServletFileUpload upload = new JakartaServletFileUpload(diskFileItemFactory);

    return upload;
}

}
