//package com.grepp.spring.infra.util.file;
//
//import static java.nio.charset.StandardCharsets.UTF_8;
//
//import com.google.cloud.storage.Blob;
//import com.google.cloud.storage.BlobId;
//import com.google.cloud.storage.BlobInfo;
//import com.google.cloud.storage.Storage;
//import com.google.cloud.storage.StorageOptions;
//import java.io.IOException;
//import java.util.UUID;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.mock.web.MockMultipartFile;
//
//@SpringBootTest
//class GoogleStorageManagerTest {
//
//    @Test
//    public void testGoogleStorage() throws IOException {
//
//        // MultipartFile 생성
//        MockMultipartFile file = new MockMultipartFile(
//            "file",
//            "test.jpg",
//            "image/jpg",
//            "test multipartFile".getBytes()
//        );
//
//        Storage storage = StorageOptions.getDefaultInstance().getService();
//        String bucketName = "grepp-lsh-storage"; // Change this to something unique
//
//        BlobId blobId = BlobId.of(bucketName, UUID.randomUUID().toString());
//        BlobInfo blobInfo = BlobInfo.newBuilder(blobId).setContentType(file.getContentType()).build();
//        Blob blob = storage.create(blobInfo, file.getBytes());
//
//    }
//}