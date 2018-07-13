# Demo for problem with Surefire and SonarQube when used with JUnit5 Dynamic Tests #




## Observed behaviour: ##


```
gradlew sonarqube --stacktrace  --info -Dsonar.host.url=XXXX -Dsonar.login=XXXX -Dsonar.branch=master

The client will now receive all logging from the daemon (pid: 6804). The daemon log file: C:\Users\leonhardt\.gradle\daemon\4.4\daemon-6804.out.log
Starting 52nd build in daemon [uptime: 1 hrs 28 mins 14.341 secs, performance: 99%, no major garbage collections]
Using 4 worker leases.
Creating new cache for fileHashes, path C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\.gradle\4.4\fileHashes\fileHashes.bin, access org.gradle.cache.internal.DefaultCacheAccess@7bfc1e9f
Starting Build
Settings evaluated using settings file 'C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\settings.gradle'.
Projects loaded. Root project using build file 'C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\build.gradle'.
Included projects: [root project 'sonarqube-junit5-problem']
Evaluating root project 'sonarqube-junit5-problem' using build file 'C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\build.gradle'.
Creating new cache for metadata-1.1/results, path C:\Users\leonhardt\.gradle\caches\transforms-1\metadata-1.1\results.bin, access org.gradle.cache.internal.DefaultCacheAccess@41620fe
Creating new cache for metadata-2.36/module-metadata, path C:\Users\leonhardt\.gradle\caches\modules-2\metadata-2.36\module-metadata.bin, access org.gradle.cache.internal.DefaultCacheAccess@5cbd87cd
Creating new cache for metadata-2.36/module-artifacts, path C:\Users\leonhardt\.gradle\caches\modules-2\metadata-2.36\module-artifacts.bin, access org.gradle.cache.internal.DefaultCacheAccess@5cbd87cd
Creating new cache for metadata-2.36/module-artifact, path C:\Users\leonhardt\.gradle\caches\modules-2\metadata-2.36\module-artifact.bin, access org.gradle.cache.internal.DefaultCacheAccess@5cbd87cd
All projects evaluated.
Selected primary task 'sonarqube' from project :
Creating new cache for annotation-processors, path C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\.gradle\4.4\fileContent\annotation-processors.bin, access org.gradle.cache.internal.DefaultCacheAccess@3b58615
Tasks to be executed: [task ':compileJava', task ':processResources', task ':classes', task ':compileTestJava', task ':processTestResources', task ':testClasses', task ':test', task ':sonarqube']
Creating new cache for resourceHashesCache, path C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\.gradle\4.4\fileHashes\resourceHashesCache.bin, access org.gradle.cache.internal.DefaultCacheAccess@7bfc1e9f
Creating new cache for taskHistory, path C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\.gradle\4.4\taskHistory\taskHistory.bin, access org.gradle.cache.internal.DefaultCacheAccess@7cabeddc
Creating new cache for outputFiles, path C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\.gradle\buildOutputCleanup\outputFiles.bin, access org.gradle.cache.internal.DefaultCacheAccess@400ace12
:compileJava (Thread[Daemon worker Thread 15,5,main]) started.
:compileJava
Putting task artifact state for task ':compileJava' into context took 0.0 secs.
Skipping task ':compileJava' as it is up-to-date (took 0.004 secs).
:compileJava UP-TO-DATE
:compileJava (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.029 secs.
:processResources (Thread[Daemon worker Thread 15,5,main]) started.
:processResources
Putting task artifact state for task ':processResources' into context took 0.0 secs.
Skipping task ':processResources' as it has no source files and no previous output files.
:processResources NO-SOURCE
:processResources (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.001 secs.
:classes (Thread[Daemon worker Thread 15,5,main]) started.
:classes
Skipping task ':classes' as it has no actions.
:classes UP-TO-DATE
:classes (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.0 secs.
:compileTestJava (Thread[Daemon worker Thread 15,5,main]) started.
:compileTestJava
Putting task artifact state for task ':compileTestJava' into context took 0.0 secs.
Skipping task ':compileTestJava' as it is up-to-date (took 0.041 secs).
:compileTestJava UP-TO-DATE
:compileTestJava (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.047 secs.
:processTestResources (Thread[Daemon worker Thread 15,5,main]) started.
:processTestResources
Putting task artifact state for task ':processTestResources' into context took 0.0 secs.
Skipping task ':processTestResources' as it has no source files and no previous output files.
:processTestResources NO-SOURCE
:processTestResources (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.001 secs.
:testClasses (Thread[Daemon worker Thread 15,5,main]) started.
:testClasses
Skipping task ':testClasses' as it has no actions.
:testClasses UP-TO-DATE
:testClasses (Thread[Daemon worker Thread 15,5,main]) completed. Took 0.0 secs.
:test (Thread[Task worker for ':' Thread 3,5,main]) started.
:test
Putting task artifact state for task ':test' into context took 0.0 secs.
Skipping task ':test' as it is up-to-date (took 0.054 secs).
:test UP-TO-DATE
:test (Thread[Task worker for ':' Thread 3,5,main]) completed. Took 0.064 secs.
:sonarqube (Thread[Task worker for ':' Thread 3,5,main]) started.
:sonarqube
Putting task artifact state for task ':sonarqube' into context took 0.0 secs.
Up-to-date check for task ':sonarqube' took 0.0 secs. It is not up-to-date because:
  Task has not declared any outputs.
User cache: C:\Users\leonhardt\.sonar\cache
Publish mode
Load global settings
Load global settings (done) | time=166ms
Server id: 14d29e76b5f4afd
User cache: C:\Users\leonhardt\.sonar\cache
Load plugins index
Load plugins index (done) | time=52ms
Default locale: "de_CH", source code encoding: "windows-1252" (analysis is platform dependent)
Process project properties
Load project repositories
Load project repositories (done) | time=20ms
Load quality profiles
Load quality profiles (done) | time=23ms
Load active rules
Load active rules (done) | time=686ms
Load metrics repository
Load metrics repository (done) | time=40ms
Project key: sonarqube-junit5-problem
Branch key: master
The use of "sonar.branch" is deprecated and replaced by "sonar.branch.name". See https://redirect.sonarsource.com/doc/branches.html.
-------------  Scan Demo f?r DynamicTest Problem mit Junit und SonarQube
Base dir: C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem
Working dir: C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\build\sonar
Source paths: src/main/java
Test paths: src/test/java
Source encoding: windows-1252, default locale: de_CH
Load server rules
Load server rules (done) | time=68ms
Index files
2 files indexed
Quality profile for java: emiWay2018
Sensor JavaSquidSensor [java]
Configured Java source version (sonar.java.source): 8
JavaClasspath initialization
JavaClasspath initialization (done) | time=13ms
JavaTestClasspath initialization
JavaTestClasspath initialization (done) | time=4ms
Java Main Files AST scan
1 source files to be analyzed
Java Main Files AST scan (done) | time=309ms
Java Test Files AST scan
1 source files to be analyzed
1/1 source files have been analyzed
1/1 source files have been analyzed
Java Test Files AST scan (done) | time=96ms
Sensor JavaSquidSensor [java] (done) | time=1088ms
Sensor FindBugs Sensor [findbugs]
Findbugs output report: C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\build\sonar\findbugs-result.xml
Sensor FindBugs Sensor [findbugs] (done) | time=3021ms
Sensor SurefireSensor [java]
parsing [C:\workspace\projects\Citysoftnet\workspace\sonarqube-junit5-problem2\sonarqube-junit5-problem\build\test-results\test]
:sonarqube FAILED
:sonarqube (Thread[Task worker for ':' Thread 3,5,main]) completed. Took 8.325 secs.

FAILURE: Build failed with an exception.

* What went wrong:
Execution failed for task ':sonarqube'.
> String index out of range: -1

* Try:
Run with --debug option to get more log output. Run with --scan to get full insights.

* Exception is:
org.gradle.api.tasks.TaskExecutionException: Execution failed for task ':sonarqube'.
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:100)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.execute(ExecuteActionsTaskExecuter.java:70)
	at org.gradle.api.internal.tasks.execution.OutputDirectoryCreatingTaskExecuter.execute(OutputDirectoryCreatingTaskExecuter.java:51)
	at org.gradle.api.internal.tasks.execution.SkipUpToDateTaskExecuter.execute(SkipUpToDateTaskExecuter.java:62)
	at org.gradle.api.internal.tasks.execution.ResolveTaskOutputCachingStateExecuter.execute(ResolveTaskOutputCachingStateExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ValidatingTaskExecuter.execute(ValidatingTaskExecuter.java:60)
	at org.gradle.api.internal.tasks.execution.SkipEmptySourceFilesTaskExecuter.execute(SkipEmptySourceFilesTaskExecuter.java:97)
	at org.gradle.api.internal.tasks.execution.CleanupStaleOutputsExecuter.execute(CleanupStaleOutputsExecuter.java:87)
	at org.gradle.api.internal.tasks.execution.ResolveTaskArtifactStateTaskExecuter.execute(ResolveTaskArtifactStateTaskExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipTaskWithNoActionsExecuter.execute(SkipTaskWithNoActionsExecuter.java:52)
	at org.gradle.api.internal.tasks.execution.SkipOnlyIfTaskExecuter.execute(SkipOnlyIfTaskExecuter.java:54)
	at org.gradle.api.internal.tasks.execution.ExecuteAtMostOnceTaskExecuter.execute(ExecuteAtMostOnceTaskExecuter.java:43)
	at org.gradle.api.internal.tasks.execution.CatchExceptionTaskExecuter.execute(CatchExceptionTaskExecuter.java:34)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker$1.run(DefaultTaskGraphExecuter.java:248)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:241)
	at org.gradle.execution.taskgraph.DefaultTaskGraphExecuter$EventFiringTaskWorker.execute(DefaultTaskGraphExecuter.java:230)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.processTask(DefaultTaskPlanExecutor.java:123)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.access$200(DefaultTaskPlanExecutor.java:79)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:104)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker$1.execute(DefaultTaskPlanExecutor.java:98)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.execute(DefaultTaskExecutionPlan.java:626)
	at org.gradle.execution.taskgraph.DefaultTaskExecutionPlan.executeWithTask(DefaultTaskExecutionPlan.java:581)
	at org.gradle.execution.taskgraph.DefaultTaskPlanExecutor$TaskExecutorWorker.run(DefaultTaskPlanExecutor.java:98)
	at org.gradle.internal.concurrent.ExecutorPolicy$CatchAndRecordFailures.onExecute(ExecutorPolicy.java:63)
	at org.gradle.internal.concurrent.ManagedExecutorImpl$1.run(ManagedExecutorImpl.java:46)
	at org.gradle.internal.concurrent.ThreadFactoryImpl$ManagedThreadRunnable.run(ThreadFactoryImpl.java:55)
Caused by: java.lang.StringIndexOutOfBoundsException: String index out of range: -1
	at org.sonar.plugins.surefire.data.SurefireStaxHandler.getClassname(SurefireStaxHandler.java:68)
	at org.sonar.plugins.surefire.data.SurefireStaxHandler.parseTestCase(SurefireStaxHandler.java:58)
	at org.sonar.plugins.surefire.data.SurefireStaxHandler.stream(SurefireStaxHandler.java:50)
	at org.sonar.plugins.surefire.StaxParser.parse(StaxParser.java:63)
	at org.sonar.plugins.surefire.StaxParser.parse(StaxParser.java:55)
	at org.sonar.plugins.surefire.SurefireJavaParser.parseFiles(SurefireJavaParser.java:111)
	at org.sonar.plugins.surefire.SurefireJavaParser.parseFiles(SurefireJavaParser.java:102)
	at org.sonar.plugins.surefire.SurefireJavaParser.collect(SurefireJavaParser.java:67)
	at org.sonar.plugins.surefire.SurefireSensor.collect(SurefireSensor.java:65)
	at org.sonar.plugins.surefire.SurefireSensor.execute(SurefireSensor.java:60)
	at org.sonar.scanner.sensor.SensorWrapper.analyse(SensorWrapper.java:53)
	at org.sonar.scanner.phases.SensorsExecutor.executeSensor(SensorsExecutor.java:88)
	at org.sonar.scanner.phases.SensorsExecutor.execute(SensorsExecutor.java:82)
	at org.sonar.scanner.phases.SensorsExecutor.execute(SensorsExecutor.java:68)
	at org.sonar.scanner.phases.AbstractPhaseExecutor.execute(AbstractPhaseExecutor.java:88)
	at org.sonar.scanner.scan.ModuleScanContainer.doAfterStart(ModuleScanContainer.java:177)
	at org.sonar.core.platform.ComponentContainer.startComponents(ComponentContainer.java:135)
	at org.sonar.core.platform.ComponentContainer.execute(ComponentContainer.java:121)
	at org.sonar.scanner.scan.ProjectScanContainer.scan(ProjectScanContainer.java:291)
	at org.sonar.scanner.scan.ProjectScanContainer.scanRecursively(ProjectScanContainer.java:286)
	at org.sonar.scanner.scan.ProjectScanContainer.doAfterStart(ProjectScanContainer.java:264)
	at org.sonar.core.platform.ComponentContainer.startComponents(ComponentContainer.java:135)
	at org.sonar.core.platform.ComponentContainer.execute(ComponentContainer.java:121)
	at org.sonar.scanner.task.ScanTask.execute(ScanTask.java:48)
	at org.sonar.scanner.task.TaskContainer.doAfterStart(TaskContainer.java:84)
	at org.sonar.core.platform.ComponentContainer.startComponents(ComponentContainer.java:135)
	at org.sonar.core.platform.ComponentContainer.execute(ComponentContainer.java:121)
	at org.sonar.scanner.bootstrap.GlobalContainer.executeTask(GlobalContainer.java:121)
	at org.sonar.batch.bootstrapper.Batch.doExecuteTask(Batch.java:116)
	at org.sonar.batch.bootstrapper.Batch.executeTask(Batch.java:111)
	at org.sonarsource.scanner.api.internal.batch.BatchIsolatedLauncher.execute(BatchIsolatedLauncher.java:63)
	at org.sonarsource.scanner.api.internal.IsolatedLauncherProxy.invoke(IsolatedLauncherProxy.java:60)
	at com.sun.proxy.$Proxy141.execute(Unknown Source)
	at org.sonarsource.scanner.api.EmbeddedScanner.doExecute(EmbeddedScanner.java:233)
	at org.sonarsource.scanner.api.EmbeddedScanner.runAnalysis(EmbeddedScanner.java:151)
	at org.sonarqube.gradle.SonarQubeTask.run(SonarQubeTask.java:99)
	at org.gradle.internal.reflect.JavaMethod.invoke(JavaMethod.java:73)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.doExecute(StandardTaskAction.java:46)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:39)
	at org.gradle.api.internal.project.taskfactory.StandardTaskAction.execute(StandardTaskAction.java:26)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:780)
	at org.gradle.api.internal.AbstractTask$TaskActionWrapper.execute(AbstractTask.java:747)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter$1.run(ExecuteActionsTaskExecuter.java:121)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:336)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor$RunnableBuildOperationWorker.execute(DefaultBuildOperationExecutor.java:328)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.execute(DefaultBuildOperationExecutor.java:199)
	at org.gradle.internal.progress.DefaultBuildOperationExecutor.run(DefaultBuildOperationExecutor.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeAction(ExecuteActionsTaskExecuter.java:110)
	at org.gradle.api.internal.tasks.execution.ExecuteActionsTaskExecuter.executeActions(ExecuteActionsTaskExecuter.java:92)
	... 29 more


* Get more help at https://help.gradle.org

BUILD FAILED in 8s
4 actionable tasks: 1 executed, 3 up-to-date
String index out of range: -1
```

The problem appears to be caused by the generated XML-file build/test-results/test/TEST-.29.xml
```
<?xml version="1.0" encoding="UTF-8"?>
<testsuite name=")" tests="1" skipped="0" failures="0" errors="0" timestamp="2018-07-12T13:52:50" hostname="NB099" time="0.005">
  <properties/>
  <testcase name="Test1(dynamicTest" classname=")" time="0.005"/>
  <system-out><![CDATA[]]></system-out>
  <system-err><![CDATA[]]></system-err>
</testsuite>
```

## Workaround ##

Using the @DisplayName annotation on the dynamic test methods leads to "better" XML generated by Surefire. The SonarQube plugin can handle this XML.