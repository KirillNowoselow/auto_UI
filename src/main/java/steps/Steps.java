package steps;

import pages.radioButtonPage.frames.RadioButtonFrame;

public interface Steps {
    TextBoxPageSteps TEXT_BOX_PAGE_STEPS = new TextBoxPageSteps();
    CheckBoxPageSteps CHECK_BOX_PAGE_STEPS = new CheckBoxPageSteps();
    WebTablesPageSteps WEB_TABLES_PAGE_STEPS = new WebTablesPageSteps();
    RadioButtonPageSteps RADIO_BUTTON_PAGE_STEPS = new RadioButtonPageSteps();
}
