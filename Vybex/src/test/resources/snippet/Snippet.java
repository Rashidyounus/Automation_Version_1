package snippet;

public class Snippet {
	[RemoteTestNG] detected TestNG version 7.11.0
	15:25:04.437 [main] DEBUG org.testng.TestNG -- suiteXmlPath: "C:\Users\RASHID~1\AppData\Local\Temp\testng-eclipse-1663283694\testng-customsuite.xml"
	15:25:04.705 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.709 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 2 ms.
	15:25:04.710 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.710 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.711 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.711 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.711 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.711 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.719 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 5 ms.
	15:25:04.728 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 8 ms.
	15:25:04.730 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.730 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.731 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.731 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.732 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.732 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.734 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.734 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.734 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.734 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.737 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.737 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.737 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.737 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.739 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.740 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.741 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.742 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.742 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.collectMethodsByGroup() took 0 ms.
	15:25:04.742 [main] INFO org.testng.internal.Utils -- [Utils] MethodGroupsHelper.sortMethods() took 0 ms.
	15:25:04.749 [main] INFO org.testng.internal.Utils -- [TestNG] Running:
	  C:\Users\Rashid Mahmood\AppData\Local\Temp\testng-eclipse-1663283694\testng-customsuite.xml
	
	15:25:04.766 [main] INFO org.testng.internal.Utils -- [Utils] DynamicGraphHelper.createDynamicGraph() took 4 ms.
	java.io.FileNotFoundException: src\test\resources\loginData.xlsx (The system cannot find the file specified)
		at java.base/java.io.FileInputStream.open0(Native Method)
		at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:152)
		at java.base/java.io.FileInputStream.<init>(FileInputStream.java:106)
		at utils.ExcelUtils.getSheetData(ExcelUtils.java:14)
		at tests.LoginTest.getLoginData(LoginTest.java:20)
		at java.base/jdk.internal.reflect.DirectMethodHandleAccessor.invoke(DirectMethodHandleAccessor.java:103)
		at java.base/java.lang.reflect.Method.invoke(Method.java:580)
		at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:141)
		at org.testng.internal.invokers.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:86)
		at org.testng.internal.invokers.MethodInvocationHelper.invokeMethodNoCheckedException(MethodInvocationHelper.java:54)
		at org.testng.internal.invokers.MethodInvocationHelper.invokeDataProvider(MethodInvocationHelper.java:159)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:809)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:734)
		at org.testng.internal.invokers.ParameterHandler.handleParameters(ParameterHandler.java:72)
		at org.testng.internal.invokers.ParameterHandler.createParameters(ParameterHandler.java:51)
		at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:949)
		at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
		at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
		at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
		at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
		at org.testng.TestRunner.privateRun(TestRunner.java:741)
		at org.testng.TestRunner.run(TestRunner.java:616)
		at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
		at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
		at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
		at org.testng.SuiteRunner.run(SuiteRunner.java:312)
		at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
		at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
		at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
		at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
		at org.testng.TestNG.runSuites(TestNG.java:1112)
		at org.testng.TestNG.run(TestNG.java:1079)
		at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
		at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
		at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
	15:25:08.661 [main] ERROR org.testng.internal.Utils -- [Error] org.testng.TestNGException: 
	Data Provider public java.lang.Object[][] tests.LoginTest.getLoginData() returned a null value
		at org.testng.internal.invokers.MethodInvocationHelper.invokeDataProvider(MethodInvocationHelper.java:161)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:809)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:734)
		at org.testng.internal.invokers.ParameterHandler.handleParameters(ParameterHandler.java:72)
		at org.testng.internal.invokers.ParameterHandler.createParameters(ParameterHandler.java:51)
		at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:949)
		at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
		at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
		at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
		at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
		at org.testng.TestRunner.privateRun(TestRunner.java:741)
		at org.testng.TestRunner.run(TestRunner.java:616)
		at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
		at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
		at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
		at org.testng.SuiteRunner.run(SuiteRunner.java:312)
		at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
		at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
		at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
		at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
		at org.testng.TestNG.runSuites(TestNG.java:1112)
		at org.testng.TestNG.run(TestNG.java:1079)
		at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
		at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
		at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
	
	FAILED: tests.LoginTest.testLoginFromExcel
	org.testng.TestNGException: 
	Data Provider public java.lang.Object[][] tests.LoginTest.getLoginData() returned a null value
		at org.testng.internal.invokers.MethodInvocationHelper.invokeDataProvider(MethodInvocationHelper.java:161)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:809)
		at org.testng.internal.Parameters.handleParameters(Parameters.java:734)
		at org.testng.internal.invokers.ParameterHandler.handleParameters(ParameterHandler.java:72)
		at org.testng.internal.invokers.ParameterHandler.createParameters(ParameterHandler.java:51)
		at org.testng.internal.invokers.TestInvoker$MethodInvocationAgent.invoke(TestInvoker.java:949)
		at org.testng.internal.invokers.TestInvoker.invokeTestMethods(TestInvoker.java:203)
		at org.testng.internal.invokers.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:154)
		at org.testng.internal.invokers.TestMethodWorker.run(TestMethodWorker.java:134)
		at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
		at org.testng.TestRunner.privateRun(TestRunner.java:741)
		at org.testng.TestRunner.run(TestRunner.java:616)
		at org.testng.SuiteRunner.runTest(SuiteRunner.java:421)
		at org.testng.SuiteRunner.runSequentially(SuiteRunner.java:413)
		at org.testng.SuiteRunner.privateRun(SuiteRunner.java:373)
		at org.testng.SuiteRunner.run(SuiteRunner.java:312)
		at org.testng.SuiteRunnerWorker.runSuite(SuiteRunnerWorker.java:52)
		at org.testng.SuiteRunnerWorker.run(SuiteRunnerWorker.java:95)
		at org.testng.TestNG.runSuitesSequentially(TestNG.java:1274)
		at org.testng.TestNG.runSuitesLocally(TestNG.java:1208)
		at org.testng.TestNG.runSuites(TestNG.java:1112)
		at org.testng.TestNG.run(TestNG.java:1079)
		at org.testng.remote.AbstractRemoteTestNG.run(AbstractRemoteTestNG.java:115)
		at org.testng.remote.RemoteTestNG.initAndRun(RemoteTestNG.java:293)
		at org.testng.remote.RemoteTestNG.main(RemoteTestNG.java:91)
	
	
	===============================================
	    Default test
	    Tests run: 1, Failures: 1, Skips: 0
	===============================================
	
	
	===============================================
	Default suite
	Total tests run: 1, Passes: 0, Failures: 1, Skips: 0
	===============================================
	
	15:25:09.168 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.reporters.jq.Main@303e3593: 46 ms
	15:25:09.177 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.reporters.FailedReporter@7f69d591: 9 ms
	15:25:09.190 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.reporters.XMLReporter@4a3e3e8b: 12 ms
	15:25:09.195 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.reporters.EmailableReporter2@389adf1d: 5 ms
	15:25:09.201 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.reporters.JUnitReportReporter@2c177f9e: 6 ms
	15:25:09.201 [main] INFO org.testng.internal.Utils -- [TestNG] Time taken by org.testng.internal.ExitCodeListener@5db4c359: 0 ms
	
}

