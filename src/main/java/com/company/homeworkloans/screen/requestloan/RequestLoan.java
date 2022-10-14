package com.company.homeworkloans.screen.requestloan;

import com.company.homeworkloans.entity.Client;
import io.jmix.core.JmixModulesAwareBeanSelector;
import io.jmix.ui.action.Action;
import io.jmix.ui.component.Component;
import io.jmix.ui.component.EntityComboBox;
import io.jmix.ui.component.ValidationErrors;
import io.jmix.ui.model.CollectionContainer;
import io.jmix.ui.screen.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

@UiController("RequestLoan")
@UiDescriptor("request-loan.xml")
public class RequestLoan extends Screen {
    @Autowired
    private CollectionContainer<Client> clientsDc;
    @Autowired
    private EntityComboBox<Client> clientPicker;

    @Subscribe("requestAction")
    public void onRequestAction(Action.ActionPerformedEvent event) {

    }
}