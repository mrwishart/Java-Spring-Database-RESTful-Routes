package com.codeclan.UserFileFolders.UserFileFolders.repository;

import com.codeclan.UserFileFolders.UserFileFolders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
