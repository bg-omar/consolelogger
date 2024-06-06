package com.github.bgomar.consolelogger.toolwindow;

/**
 * {@link ComboBoxWithImageRenderer} item: PNG or SVG image + text.
 * @param title item's text
 * @param imagePath item's image path relative to 'resources' folder, without leading {@code /}. Example: {@code consolelogger/image.svg}
 */
public record ComboBoxWithImageItem(String title, String imagePath) {

    public String displayName() {
        return title;
    }
}