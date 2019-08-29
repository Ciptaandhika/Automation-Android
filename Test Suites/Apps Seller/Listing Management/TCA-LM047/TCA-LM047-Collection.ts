<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteCollectionEntity>
   <description>1. Seller click button 'Submit Produk' for selected product
2. Seller login with same account in other device
3. Seller access menu Listing Management-Produk Dijual</description>
   <name>TCA-LM047-Collection</name>
   <tag></tag>
   <executionMode>SEQUENTIAL</executionMode>
   <maxConcurrentInstances>8</maxConcurrentInstances>
   <testSuiteRunConfigurations>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>staging</profileName>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCA-LM047/TCA-LM047a</testSuiteEntity>
      </TestSuiteRunConfiguration>
      <TestSuiteRunConfiguration>
         <configuration>
            <groupName>Mobile</groupName>
            <profileName>staging</profileName>
            <runConfigurationId>Android</runConfigurationId>
         </configuration>
         <runEnabled>true</runEnabled>
         <testSuiteEntity>Test Suites/Apps Seller/Listing Management/TCA-LM047/TCA-LM047b</testSuiteEntity>
      </TestSuiteRunConfiguration>
   </testSuiteRunConfigurations>
</TestSuiteCollectionEntity>
