package net.xpoxy.triballarie.screen;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

@Environment(EnvType.CLIENT)
public class TribalScreen extends Screen {
    public TribalScreen() {
        super(Text.literal("Tribe"));
    }

    public ButtonWidget diplomacyButton;

    protected void init() {
        diplomacyButton = ButtonWidget.builder(Text.literal("Diplomacy"), button -> {
                    // switch to diplomacy screen
                })
                .tooltip(Tooltip.of(Text.literal("Enter Diplomacy Screen")))
                .dimensions(width / 2 - 205, 20, 200, 20)
                .build();

        addDrawableChild(diplomacyButton);
    }
}
