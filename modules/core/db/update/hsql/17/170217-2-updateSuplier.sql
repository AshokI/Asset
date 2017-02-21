alter table ASSETMANAGEMENT_SUPLIER add column SUPLIERNAME varchar(55) default '' not null ;
alter table ASSETMANAGEMENT_SUPLIER drop column NAME cascade ;
