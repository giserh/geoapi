/*$************************************************************************************************
 **
 ** $Id$
 **
 ** $Source$
 **
 ** Copyright (C) 2003 Open GIS Consortium, Inc. All Rights Reserved. http://www.opengis.org/Legal/
 **
 *************************************************************************************************/
package org.opengis.spatialschema.geometry.geometry;

// J2SE directdependencies
import java.util.List;
import java.util.ArrayList;

// OpenGIS direct dependencies
import org.opengis.util.CodeList;

// Annotations
///import org.opengis.annotation.UML;
///import static org.opengis.annotation.Obligation.*;


/**
 * Indicates which sort of curve may be approximated by a particular B-spline.
 *
 * @author ISO/DIS 19107
 * @author <A HREF="http://www.opengis.org">OpenGIS&reg; consortium</A>
 * @version 2.0
 */
///@UML (identifier="GM_SplineCurveForm")
public final class SplineCurveForm extends CodeList {
    /**
     * Serial number for compatibility with different versions.
     */
    private static final long serialVersionUID = 7692137703533158212L;

    /**
     * List of all enumerations of this type.
     * Must be declared before any enum declaration.
     */
    private static final List VALUES = new ArrayList(5);

    /**
     * A connected sequence of line segments represented by a 1 degree B-spline (a line string).
     */
/// @UML (identifier="polylineForm", obligation=CONDITIONAL)
    public static final SplineCurveForm POLYLINE_FORM = new SplineCurveForm(
                                       "POLYLINE_FORM");

    /**
     * An arc of a circle or a complete circle.
     */
/// @UML (identifier="circularArc", obligation=CONDITIONAL)
    public static final SplineCurveForm CIRCULAR_ARC = new SplineCurveForm(
                                       "CIRCULAR_ARC");

    /**
     * An arc of an ellipse or a complete ellipse.
     */
/// @UML (identifier="ellipticalArc", obligation=CONDITIONAL)
    public static final SplineCurveForm ELLIPTICAL_ARC = new SplineCurveForm(
                                       "ELLIPTICAL_ARC");

    /**
     * An arc of a finite length of a parabola.
     */
/// @UML (identifier="parabolicArc", obligation=CONDITIONAL)
    public static final SplineCurveForm PARABOLIC_ARC = new SplineCurveForm(
                                       "PARABOLIC_ARC");

    /**
     * An arc of a finite length of one branch of a hyperbola.
     */
/// @UML (identifier="hyperbolicArc", obligation=CONDITIONAL)
    public static final SplineCurveForm HYPERBOLIC_ARC = new SplineCurveForm(
                                       "HYPERBOLIC_ARC");

    /**
     * Constructs an enum with the given name. The new enum is
     * automatically added to the list returned by {@link #values}.
     *
     * @param name The enum name. This name must not be in use by an other enum of this type.
     */
    public SplineCurveForm(final String name) {
        super(name, VALUES);
    }

    /**
     * Returns the list of <code>SplineCurveForm</code>s.
     */
    public static SplineCurveForm[] values() {
        synchronized (VALUES) {
            return (SplineCurveForm[]) VALUES.toArray(new SplineCurveForm[VALUES.size()]);
        }
    }

    /**
     * Returns the list of enumerations of the same kind than this enum.
     */
    public /*{SplineCurveForm}*/ CodeList[] family() {
        return values();
    }
}