-- begin ASSETMANAGEMENT_ADD_ASSET
alter table ASSETMANAGEMENT_ADD_ASSET add constraint FK_ASSETMANAGEMENT_ADD_ASSET_NAME foreign key (NAME_ID) references ASSETMANAGEMENT_ASSET(ID)^
create unique index IDX_ASSETMANAGEMENT_ADD_ASSET_UNIQ_ASSETID on ASSETMANAGEMENT_ADD_ASSET (ASSETID) ^
create index IDX_ASSETMANAGEMENT_ADD_ASSET_NAME on ASSETMANAGEMENT_ADD_ASSET (NAME_ID)^
-- end ASSETMANAGEMENT_ADD_ASSET
-- begin ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK
alter table ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK add constraint FK_AAASL_SUPLIER foreign key (SUPLIER_ID) references ASSETMANAGEMENT_SUPLIER(ID)^
alter table ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK add constraint FK_AAASL_ADD_ASSET foreign key (ADD_ASSET_ID) references ASSETMANAGEMENT_ADD_ASSET(ID)^
-- end ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK
-- begin ASSETMANAGEMENT_SELECTASSET
alter table ASSETMANAGEMENT_SELECTASSET add constraint FK_ASSETMANAGEMENT_SELECTASSET_NAME foreign key (NAME_ID) references ASSETMANAGEMENT_ADD_ASSET(ID)^
alter table ASSETMANAGEMENT_SELECTASSET add constraint FK_ASSETMANAGEMENT_SELECTASSET_ASSETID foreign key (ASSETID_ID) references ASSETMANAGEMENT_ADD_ASSET(ID)^
create index IDX_ASSETMANAGEMENT_SELECTASSET_NAME on ASSETMANAGEMENT_SELECTASSET (NAME_ID)^
create index IDX_ASSETMANAGEMENT_SELECTASSET_ASSETID on ASSETMANAGEMENT_SELECTASSET (ASSETID_ID)^
-- end ASSETMANAGEMENT_SELECTASSET
