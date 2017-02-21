package com.company.assetmanagement.web.request;

import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.*;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.company.assetmanagement.entity.Asset;
import com.company.assetmanagement.entity.AddAsset;
import com.company.assetmanagement.entity.Branch;
import com.company.assetmanagement.entity.Send;
//import com.sample.library.service.BookInstanceService;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;

public class RequestBrowse extends AbstractLookup {
  

    @Inject
    private CollectionDatasource<Asset, UUID> assetsDs;

    @Inject
    private CollectionDatasource<AddAsset, UUID> addAssetDs;

    @Inject
    private CollectionDatasource<Branch, UUID> branchesDs;

    @Inject
    private LookupPickerField assetField;

   
    @Inject
    private Table<Asset> assetsTable;
     @Inject
    private Table<AddAsset> addAssetsTable;

    @Inject
    private TextField InstancesAmountField;

    @Inject
    private Table<Branch> branchesTable;

    @Inject
    private Metadata metadata;

    @Override
    public void init(Map<String, Object> params) {
        assetField.addValueChangeListener(e -> addAssetDs.refresh());
           }

    public void createAsset() {
        final Window.Editor assetEditor = openEditor(
                "assetmanagement$Asset.edit", metadata.create(Asset.class), WindowManager.OpenType.THIS_TAB
        );
            assetEditor.addCloseListener(actionId -> {
            assetsDs.refresh();
            assetField.setValue(assetEditor.getItem());
        });
    }

    public void createcompany() {
        Asset asset = assetField.getValue();
        if (asset == null) {
            showNotification(getMessage("selectAsset.text"), NotificationType.HUMANIZED);
            return;
        }

        AddAsset addasset = metadata.create(AddAsset.class);
        addasset.setName(asset);
        
        Window.Editor addassetEditor = openEditor(
                "assetmanagement$AddAsset.edit", addasset, WindowManager.OpenType.THIS_TAB
        );
        addassetEditor.addCloseListener(actionId -> addAssetDs.refresh());
    }

  
   
    

}