package com.assignment.fileio.operations.test;


import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Properties;

import org.junit.Test;

import com.assignment.fileio.operations.FileOperations;
import com.assignment.fileio.operations.FileOperationsImpl;

import junit.framework.Assert;

public class FileOperationsTest {

	static Properties properties = null;

	static {
		try {
			properties = FileIOUtils.getFilePropertyValues();
		} catch (Exception e) {
			// should never happen
			e.printStackTrace();
			System.out.println("test generating...");
		}

	}

	//SalaryProcessor salaryProcessor = new SalaryProcessorImpl();
	FileOperations fileOperations = new FileOperationsImpl();

	
	@Test
	public void testListAllFilesName() {
		List allFiles = fileOperations.getAllFilesFromSourceFolder();
		String allFilesString = allFiles.toArray().toString();
		String actualFilesString = (String) properties.get("sourcefolderfiles");
		assertEquals(allFilesString, actualFilesString);
	}

	@Test
	public void testCountAllFiles() {
		List allFiles = fileOperations.getAllFilesFromSourceFolder();
		Integer allFilesCount = allFiles.toArray().length;
		String actualFilesCount = (String) properties.get("sourcefolderfilecount");
		assertEquals(allFilesCount, actualFilesCount);
	}
	
	@Test
	public void testCopyFilesToTargetFolder() {
		Boolean copySuccess = fileOperations.copyFilesToTargetFolder();
		Boolean copyActual = (Boolean) properties.get("copytotargetfolder");
		assertEquals(copySuccess, copyActual);
	}
	
	@Test
	public void testCountAllFilesInTargetFolder() {
		List allFiles = fileOperations.getAllFilesFromTargetFolder();
		Integer allFilesCount = allFiles.toArray().length;
		String actualFilesCount = (String) properties.get("targetfolderfilescount");
		assertEquals(allFilesCount, actualFilesCount);
	}
	
	@Test
	public void testDeleteAllFilesInTargetFolder() {
		Boolean deleteSuccess = fileOperations.copyFilesToTargetFolder();
		Boolean deleteActual = (Boolean) properties.get("copytotargetfolder");
		assertEquals(deleteSuccess, deleteActual);
	}
	
	@Test
	public void testCountAllFilesInTargetFolderAfterDeletion() {
		List allFiles = fileOperations.getAllFilesFromTargetFolder();
		Integer allFilesCount = allFiles.toArray().length;
		String actualFilesCount = (String) properties.get("deletedtargetfolderfilescount");
		assertEquals(allFilesCount, actualFilesCount);
	}
	
	

	
	
	
	
	
	
	

}
