package uzo.addon;

import uzo.addon.modules.BoxESP;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class UzoAddon extends MeteorAddon {
    public static final Category CATEGORY = new Category("Uzo");

    @Override
    public void onInitialize() {
        Modules.get().add(new BoxESP());
    }

    @Override
    public void onRegisterCategories() {
        Modules.registerCategory(CATEGORY);
    }

    @Override
    public String getPackage() {
        return "uzo.addon";
    }
}
