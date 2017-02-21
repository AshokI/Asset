create table ASSETMANAGEMENT_ADD_ASSET_ASSET_LINK (
    ADD_ASSET_ID varchar(36) not null,
    ASSET_ID varchar(36) not null,
    primary key (ADD_ASSET_ID, ASSET_ID)
);
