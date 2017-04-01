package com.team.web.controller;

import com.team.util.EditormdUploadResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by BLACK on 2017/3/25.
 */
@Controller
@RequestMapping(value="/upload")
public class UploadController {

    @ResponseBody
    @PostMapping(value="/editorUpload")
    public EditormdUploadResult fileUploadHandle(HttpServletRequest request, @RequestParam(value = "editormd-image-file", required = false) MultipartFile attach){
        EditormdUploadResult result = new EditormdUploadResult();
        try {
            String rootPath = request.getSession().getServletContext().getRealPath("/upload/");
            //创建文件
            File filePath=new File(rootPath);
            if(!filePath.exists()){
                filePath.mkdir();
            }
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHssmmSS");
            String fileNewName = sdf.format(new Date())+"."+attach.getOriginalFilename().substring(attach.getOriginalFilename().lastIndexOf(".")+1);;
            File realFile=new File(rootPath+ File.separator+fileNewName);
            //FileUtils.copyInputStreamToFile(attach.getInputStream(), realFile);
            attach.transferTo(realFile);
            result.setUrl(request.getSession().getServletContext().getContextPath()+"/upload/" + fileNewName);
        } catch (Exception e) {
            result.setSuccess(0);
            result.setMessage("图片上传失败！("+e.getMessage()+")");
            return result;
        }
        return  result;
    }
}
