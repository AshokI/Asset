-- update ASSETMANAGEMENT_ADD_ASSET set NAME_ID = <default_value> where NAME_ID is null ;
alter table ASSETMANAGEMENT_ADD_ASSET alter column NAME_ID set not null ;
