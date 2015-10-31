package module1;
import processing.core.PApplet;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.utils.MapUtils;

public class SampleMapApp extends PApplet {
	 
    UnfoldingMap map;
 
    public void setup() {
        size(800, 600);
        map = new UnfoldingMap(this);
     
        // Show map around the location in the given zoom level.
        map.zoomAndPanTo(10, new Location(52.5f, 13.4f));
 
        // Add mouse and keyboard interactions
        MapUtils.createDefaultEventDispatcher(this, map);
    }
 
    public void main() {
        map.draw();
    }
 
}