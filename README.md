# ZOHO CRM JAVA SDK 7.0 for API version 7

The Java SDK for Zoho CRM allows developers to easily create Java applications that can be integrated with Zoho CRM. This SDK serves as a wrapper for the REST APIs, making it easier to access and utilize the services of Zoho CRM. 
Authentication to access the CRM APIs is done through OAuth2.0, and the authentication process is streamlined through the use of the Java SDK. The grant and access/refresh tokens are generated and managed within the SDK code, eliminating the need for manual handling during data synchronization between Zoho CRM and the client application.

This repository includes the JAVA SDK for API v7 of Zoho CRM. Check [Versions](https://github.com/zoho/zohocrm-java-sdk-7.0/releases) for more details on the versions of SDK released for this API version.

License
=======

    Copyright (c) 2021, ZOHO CORPORATION PRIVATE LIMITED 
    All rights reserved. 

    Licensed under the Apache License, Version 2.0 (the "License"); 
    you may not use this file except in compliance with the License. 
    You may obtain a copy of the License at 
    
        http://www.apache.org/licenses/LICENSE-2.0 
    
    Unless required by applicable law or agreed to in writing, software 
    distributed under the License is distributed on an "AS IS" BASIS, 
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
    See the License for the specific language governing permissions and 
    limitations under the License.

## Latest Version

- [5.0.0](/versions/5.0.0/README.md)

  - Added new **page_token** param in GetAttachmentsParam class.
  - DealContactRolesOperations class method name chnaged(deleteContactRoleRealation to deleteContactRoleRelation).
  - Added **category**, **sort_by**, **sort_order**, and **filters** param in GetEmailTemplatesParam class.
  - Added new fields (**referenceValue**, **dealCategory**, and **showValue**) in fields PickListValue class.
  - Added new **filters** param in GetInventoryTemplatesParam class.
  - Modules displayField field datatype changed(String to Object).
  - Added new **status** param in GetModulesParam class.
  - Added new **paramInstance** param in ModulesOperations class **getModules** method.
  - Added new **type** param in SearchRecordsParam class.
  - Added new **cvid** param in RecordCountParam class.
  - Added new **page_token**, **page**, and **per_page** param in GetRecordLockingInformationsParam class.
  - Added new **color_code** param in CreateTagsParam class.
  - Added new **ids** param in GetTerritoriesParam class.
  - Added new **page** and **per_page** param in GetChildTerritoryParam class.
  - Added new **filters**, **page**, and **per_page** param in GetAssociatedUsersCountParam class.
  - Added new **paramInstance** param in UserGroupsOperations class **getAssociatedUsersCount** method.
  - Deprecated and removed API methods:
    - UsersTerritories
      - validateBeforeTransferForAllTerritories
      - validateBeforeTransfer
      - delinkAndTransferFromAllTerritories
      - delinkAndTransferFromSpecificTerritory
  - Support for the following new APIs
    - AuditLogExport
      - [Download Export Audit Log Result](https://www.zoho.com/crm/developer/docs/api/v7/download-export-audit-log-result.html)
    - Cadences
      - [Cadence API](https://www.zoho.com/crm/developer/docs/api/v7/cadences/get-cadences.html)
    - DealContactRoles
      - [Remove Contact Role from a Specific Deal](https://www.zoho.com/crm/developer/docs/api/v7/remove-contact-role-from-a-specific-deal.html)
    - InventoryConvert
      - [Convert Inventory Records](https://www.zoho.com/crm/developer/docs/api/v7/inventory-convert.html)
    - InventoryMassConvert
      - [Mass Convert Inventory Records](https://www.zoho.com/crm/developer/docs/api/v7/mass-inventory-convert.html)
      - [Get Mass Inventory Conversion Status](https://www.zoho.com/crm/developer/docs/api/v7/mass-inventory-conversion-status-api.html)
    - Layouts
      - [Update Custom Layout](https://www.zoho.com/crm/developer/docs/api/v7/update-custom-layout.html)
      - [Delete Custom Layout](https://www.zoho.com/crm/developer/docs/api/v7/delete-custom-layout.html)
      - [Activate Custom Layout](https://www.zoho.com/crm/developer/docs/api/v7/activate-custom-layout.html)
      - [Deactivate Custom Layout](https://www.zoho.com/crm/developer/docs/api/v7/deactivate-custom-layout.html)
    - Modules
      - [Create Custom Module](https://www.zoho.com/crm/developer/docs/api/v7/create-custom-module-api.html)
    - Record
      - [Get Rich Text Fields](https://www.zoho.com/crm/developer/docs/api/v7/get-rich-text-fields.html)
    - RecordLockingConfiguration
      - [Record Locking Configuration APIs](https://www.zoho.com/crm/developer/docs/api/v7/get-record-locking-config.html)
      - [Add Record Locking Configuration](https://www.zoho.com/crm/developer/docs/api/v7/add-record-locking-config.html)
      - [Update Record Locking Configuration](https://www.zoho.com/crm/developer/docs/api/v7/update-record-locking-config.html)
      - [Delete Record Locking Configuration](https://www.zoho.com/crm/developer/docs/api/v7/delete-record-locking-config.html)
    - RecycleBin
      - [Get Recycle Bin Records](https://www.zoho.com/crm/developer/docs/api/v7/get-recycle-bin.html)
      - [Delete Recycle Bin Records](https://www.zoho.com/crm/developer/docs/api/v7/del-recycle-bin-records.html)
    - usergroups
      - [Associated Groups of a User](https://www.zoho.com/crm/developer/docs/api/v7/associated-groups-of-a-user.html)
    - UsersTerritories
      - [Remove Territories from User](https://www.zoho.com/crm/developer/docs/api/v7/remove-territories-from-user.html)
    - ZiaEnrichment
      - [Enrichment Configuration](https://www.zoho.com/crm/developer/docs/api/v7/zia-enrichment/get-config.html)

- [4.0.0](/versions/4.0.0/README.md)

    - Email Related Records Email class threadId field datatype changed(Long to String).

- [3.1.0](/versions/3.1.0/README.md)

    - Supported delete field in PickListValue in Fields API.

- [3.0.0](/versions/3.0.0/README.md)

    - RemoveTagsFromMultipleRecordsParam class IDS param datatype changed(Long to String).

- [2.0.0](/versions/2.0.0/README.md)

    - Handled Error Structure in MassDeleteTags API.

- [1.0.0](/versions/1.0.0/README.md)

    - JAVA SDK upgraded to support v7 APIs.

    - JAVA SDK improved to support the following new APIs

      - [Export Audit Log API](https://www.zoho.com/crm/developer/docs/api/v7/create-export-audit-log.html)
      - [Cadence API](https://www.zoho.com/crm/developer/docs/api/v7/cadences/get-cadences.html)
      - [Record Clone API](https://www.zoho.com/crm/developer/docs/api/v7/record-clone.html)
      - [Duplicate Record Check API](https://www.zoho.com/crm/developer/docs/api/v7/enable-duplicate-record-check.html)
      - [Data People Enrichment API](https://www.zoho.com/crm/developer/docs/api/v7/zia-enrichment/create-ppl-enrichment.html)
      - [Data Org Enrichment API](https://www.zoho.com/crm/developer/docs/api/v7/zia-enrichment/get-config.html)
      - [Mass Delete Tags API](https://www.zoho.com/crm/developer/docs/api/v7/mass-delete-tags.html)
      - [Picklist Option API](https://www.zoho.com/crm/developer/docs/api/v7/picklist-values.html)
      - [API Fetcher](https://www.zoho.com/crm/developer/docs/api/v7/list-available-rest-apis.html)


For older versions, please [refer](https://github.com/zoho/zohocrm-java-sdk-7.0/releases).


## Including the SDK in your project
You can include the SDK to your project using:
- Maven
- [Gradle](/versions/5.0.0/README.md#including-the-sdk-in-your-project)
- [Download SDK jar](https://maven.zohodl.com/com/zoho/crm/zohocrm-java-sdk-7-0/5.0.0/zohocrm-java-sdk-7-0-5.0.0.jar)

For including the latest [version](https://github.com/zoho/zohocrm-java-sdk-7.0/releases/tag/5.0.0) using Maven, include the following in your **pom.xml** file, which will get created once your **Java** project is created using Maven.

    ```xml
    <repositories>
        <repository>
            <id>zohocrm-java-sdk-7-0</id>
            <url>https://maven.zohodl.com</url>
        </repository>
    </repositories>
    <dependencies>
        <dependency>
            <groupId>com.zoho.crm</groupId>
            <artifactId>zohocrm-java-sdk-7-0</artifactId>
            <version>5.0.0</version>
        </dependency>
    </dependencies>
    ```

---

**NOTE** 

> - The **access and refresh tokens are environment-specific and domain-specific**. When you handle various environments and domains such as **Production**, **Sandbox**, or **Developer** and **IN**, **CN**, **US**, **EU**, **JP**, or **AU**, respectively, you must use the access token and refresh token generated only in those respective environments and domains. The SDK throws an error, otherwise.
For example, if you generate the tokens for your Sandbox environment in the CN domain, you must use only those tokens for that domain and environment. You cannot use the tokens generated for a different environment or a domain.

> - For **Deal Contact Roles API and Records API**, you will need to provide the **ZohoCRM.settings.fields.ALL** scope along with the **ZohoCRM.modules.ALL** scope while generating the OAuthtoken. Otherwise, the system returns the **OAUTH-SCOPE-MISMATCH** error.

> - For **Related Records API**, the scopes required for generating OAuthtoken are **ZohoCRM.modules.ALL**, **ZohoCRM.settings.fields.ALL** and **ZohoCRM.settings.related_lists.ALL**. Otherwise, the system returns the **OAUTH-SCOPE-MISMATCH** error.

> - For **Mass Convert API**, you will need to provide the **ZohoCRM.settings.fields.ALL** scope along with the **ZohoCRM.mass_convert.leads.CREATE** and **ZohoCRM.mass_convert.leads.READ** scope while generating the OAuthtoken. Otherwise, the system returns the **OAUTH-SCOPE-MISMATCH** error.

---

For more details, kindly refer [here](/versions/5.0.0/README.md).
