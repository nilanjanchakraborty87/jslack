package com.github.seratch.jslack.api.methods.request.files;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilesDeleteRequest {

    private String token;
    private String file;
}