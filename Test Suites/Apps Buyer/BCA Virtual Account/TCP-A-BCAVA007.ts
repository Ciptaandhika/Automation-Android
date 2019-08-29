<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description>1. Add to cart product. Ensure that total payment less than Rp.10.000
2. On cart page, click 'Pembayaran'
3. System will redirect to ChoosePayment page
4. choose 'jenis pengiriman' and choose 'kurir standar'
5. Click 'Pilih Metode Pembayaran'
6. Click on 'Bank BCA' and then click 'BCA Virtual Account' payment method then 'Bayar' the order</description>
   <name>TCP-A-BCAVA007</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>120</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <testSuiteGuid>0c965062-7dce-4a29-82b0-99cce2c9d2f0</testSuiteGuid>
   <testCaseLink>
      <guid>6f63ec9b-ee16-4fc4-9536-a4c1b4d79d1b</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0301_Mainsite/030101_Homepage/GoToPencarianPage</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>bed79cc7-d2cd-44c9-8e9b-2881899e1043</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0301_Mainsite/030105_SearchProduct/SearchProductLessThan10k</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>582cc6e2-3045-48f6-8fca-56561c19e46d</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0303_Product/030301_PDP/ClickTambahTroli_ClickCartIcon</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>f25f4dbb-f527-41a7-8bd1-86f37e7c00d8</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0304_Trade/030401_Cart/ClickButtonPembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>fb107194-98bf-4f77-93c0-5ff3038b8d33</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0304_Trade/030402_OrderConfrim/ChooseJasaPengiriman_KurirStandar_PilihMetodePembayaran</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>9e7ad8ff-bbc9-4eb8-bd9c-ec450ceb74a9</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0304_Trade/030403_MethodPayment/ClickBCA_ClickVirtualAccount_ClickBayar</testCaseId>
   </testCaseLink>
   <testCaseLink>
      <guid>6d36ad3c-be6d-47fe-bcf7-447e7205f717</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/03_Android/0304_Trade/030403_MethodPayment/VerifyPopUpInformasiMinimalTransaksi10K</testCaseId>
   </testCaseLink>
</TestSuiteEntity>
