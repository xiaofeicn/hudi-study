# hudi-study
### Exception 
1.IllegalArgumentException Not in marker dir.
  -  作用
	'''
	Exception in thread "main" java.lang.IllegalArgumentException: Not in marker dir. Marker Path=hdfs://cj-master:8020/study/hudi-study/hudi_datatest_data\.hoodie\.temp\20200119164949/aaa/7a3404a2-cb29-401d-a6bd-fe7244e407e0-0_0-21-18_20200119164949.marker, Expected Marker Root=/study/hudi-study/hudi_datatest_data/.hoodie/.temp/20200119164949

	 路径创建错误[\.hoodie\.temp\] 正确路径[/.hoodie/.temp/] 疑似系统原因导致，在linux spark shell 通过，在win失败
	'''
