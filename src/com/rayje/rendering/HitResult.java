package com.rayje.rendering;

import com.rayje.rendering.renderables.IRenderable;

/**
 * Created by scott on 5/7/16.
 */

public class HitResult {
    public Vector3 position;
    public Ray ray;
    public IRenderable renderable;

    public HitResult(IRenderable hitObject, Vector3 iPos, Ray hittingRay) {
        renderable = hitObject;
        position = iPos;
        ray = hittingRay;
    }
}
