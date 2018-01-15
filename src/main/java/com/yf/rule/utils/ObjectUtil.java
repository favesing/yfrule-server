package com.yf.rule.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bstek.urule.ClassUtils;

public class ObjectUtil {
	
	public static String toXml(Class<?> cls, File file) throws IOException{
		ObjectUtil.saveXml(cls, file);
		return ObjectUtil.readXml(file);
	}
	public static void saveXml(Class<?> cls, File file){
		ClassUtils.classToXml(cls, file);
	}
	public static String readXml(File file) throws IOException{
		if(!file.exists()){
			throw new FileNotFoundException(file.getName() + ":未找到");
		}
		if(!file.canRead()){
			throw new IOException(file.getName() + ":不可读");
		}
		StringBuilder sb = new StringBuilder();
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = null;
		while((line = reader.readLine())  != null){
			sb.append(line);
		}
		reader.close();
		return sb.toString();
	}
}
