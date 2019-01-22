package com.codeclan.UserFileFolders.UserFileFolders.projections;

import com.codeclan.UserFileFolders.UserFileFolders.models.File;
import com.codeclan.UserFileFolders.UserFileFolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFolder", types = File.class)
public interface EmbedFolder {
    String getName();
    Folder getFolder();
    String getUserName();
}
