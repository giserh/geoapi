package org.opengis.feature;

public interface FeatureListener {
    /**
     * Invoked if features were added to or became members of a collection we
     * are listening to.
     */
    public void featuresAdded(FeatureEvent e);

    /**
     * Invoked if features were removed from or no longer members of a
     * collection we are listening to.
     */
    public void featuresRemoved(FeatureEvent e);

    /**
     * Invoked if the values of the attributes of features 
     * @param e
     */
    public void featuresChanged(FeatureEvent e);
}
