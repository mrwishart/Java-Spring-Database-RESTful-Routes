package com.codeclan.UserFileFolders.UserFileFolders.repository;

import com.codeclan.UserFileFolders.UserFileFolders.models.File;
import com.codeclan.UserFileFolders.UserFileFolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
