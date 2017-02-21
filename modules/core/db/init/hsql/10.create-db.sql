-- begin ASSETMANAGEMENT_ADD_ASSET
create table ASSETMANAGEMENT_ADD_ASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_ID varchar(36),
    ASSETID integer not null,
    COMPANY varchar(55) not null,
    MODELNAME varchar(55) not null,
    SERIALNO integer,
    STATUS integer not null,
    COST integer,
    PURCHASEDATE date,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_ADD_ASSET
-- begin ASSETMANAGEMENT_SUPLIER
create table ASSETMANAGEMENT_SUPLIER (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SUPLIERNAME varchar(55) not null,
    STATE varchar(55) not null,
    PLACE varchar(55),
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_SUPLIER
-- begin ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK
create table ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK (
    SUPLIER_ID varchar(36) not null,
    ADD_ASSET_ID varchar(36) not null,
    primary key (SUPLIER_ID, ADD_ASSET_ID)
)^
-- end ASSETMANAGEMENT_ADD_ASSET_SUPLIER_LINK
-- begin ASSETMANAGEMENT_REQUEST
create table ASSETMANAGEMENT_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_REQUEST
-- begin ASSETMANAGEMENT_SELECTASSET
create table ASSETMANAGEMENT_SELECTASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REQUESTED varchar(255),
    NAME_ID varchar(36),
    BRANCH varchar(255),
    ASSETID_ID varchar(36),
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_SELECTASSET
-- begin ASSETMANAGEMENT_BRANCH
create table ASSETMANAGEMENT_BRANCH (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BRANCHNAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_BRANCH
-- begin ASSETMANAGEMENT_ASSET
create table ASSETMANAGEMENT_ASSET (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(55) not null,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_ASSET
-- begin ASSETMANAGEMENT_SEND
create table ASSETMANAGEMENT_SEND (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUMBER_ integer,
    --
    primary key (ID)
)^
-- end ASSETMANAGEMENT_SEND
