package com.assignment.fileio.operations;

import java.util.List;

public interface FileOperations {
	/**
	 * Get list of all files from current folder
	 */
	public List getAllFilesFromSourceFolder();
	
	/**
	 * Copy all files from source to target folder
	 */
	public boolean copyFilesToTargetFolder();
	
	/**
	 * Get all files from target folder
	 */
	public List getAllFilesFromTargetFolder();
	
	/**
	 * Delete all files from target folder
	 */
	public boolean deleteAllFilesFromTargetFolder();

}
