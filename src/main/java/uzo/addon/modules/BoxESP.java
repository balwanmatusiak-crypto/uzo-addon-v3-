package uzo.addon.modules;

import uzo.addon.UzoAddon;
import meteordevelopment.meteorclient.events.render.Render3DEvent;
import meteordevelopment.meteorclient.renderer.ShapeMode;
import meteordevelopment.meteorclient.settings.*;
import meteordevelopment.meteorclient.systems.modules.Module;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;

public class BoxESP extends Module {
    private final SettingGroup sgGeneral = settings.getDefaultGroup();

    private final Setting<SettingColor> color = sgGeneral.add(new ColorSetting.Builder()
        .name("color")
        .description("Box color.")
        .defaultValue(new SettingColor(255, 0, 0, 100))
        .build()
    );

    public BoxESP() {
        super(UzoAddon.CATEGORY, "box-esp", "Draws boxes around players through walls.");
    }

    @EventHandler
    private void onRender3D(Render3DEvent event) {
        for (Entity entity : mc.world.getEntities()) {
            if (entity == mc.player || !(entity instanceof PlayerEntity)) continue;

            event.renderer.box(entity.getBoundingBox(), color.get(), color.get(), ShapeMode.Both, 0);
        }
    }
}
