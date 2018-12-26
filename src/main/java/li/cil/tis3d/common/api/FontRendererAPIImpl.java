package li.cil.tis3d.common.api;

import li.cil.tis3d.api.detail.FontRendererAPI;
import li.cil.tis3d.client.render.font.SmallFontRenderer;

/**
 * Provide access to our tiny mono-space font.
 */
public final class FontRendererAPIImpl implements FontRendererAPI {
    @Override
    public void drawString(final String string) {
        SmallFontRenderer.INSTANCE.drawString(string);
    }

    @Override
    public void drawString(final String string, final int maxChars) {
        SmallFontRenderer.INSTANCE.drawString(string, maxChars);
    }

    @Override
    public int getCharWidth() {
        return SmallFontRenderer.INSTANCE.getCharWidth();
    }

    @Override
    public int getCharHeight() {
        return SmallFontRenderer.INSTANCE.getCharHeight();
    }
}
