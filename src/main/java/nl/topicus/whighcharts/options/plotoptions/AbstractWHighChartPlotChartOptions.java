package nl.topicus.whighcharts.options.plotoptions;

import java.io.Serializable;

import nl.topicus.whighcharts.options.chart.WHighChartChartEventsOptions;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class AbstractWHighChartPlotChartOptions<T extends AbstractWHighChartPlotChartOptions<T>>
		implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * A name for the dash style to use for the graph. Applies only to series type having
	 * a graph, like line, spline, area and scatter in case it has a lineWidth. The value
	 * for the dashStyle include: Solid ShortDash ShortDot ShortDashDot ShortDashDotDot
	 * Dot Dash LongDash DashDot LongDashDot LongDashDotDot Defaults to null.
	 */
	private WHighChartPlotDashStyleType dashStyle;

	/**
	 * Event listeners for chart events.
	 */
	private WHighChartChartEventsOptions events;

	/**
	 * Fill opacity for the area. Defaults to .75.
	 */
	private Number fillOpacity;

	/**
	 * Whether to stack the values of each series on top of each other. Possible values
	 * are null to disable, "normal" to stack by value or "percent". Defaults to null.
	 */
	private String stacking;

	public WHighChartPlotDashStyleType getDashStyle()
	{
		return dashStyle;
	}

	@SuppressWarnings("unchecked")
	public T setDashStyle(WHighChartPlotDashStyleType dashStyle)
	{
		this.dashStyle = dashStyle;
		return (T) this;
	}

	public Number getFillOpacity()
	{
		return fillOpacity;
	}

	@SuppressWarnings("unchecked")
	public T setFillOpacity(Number fillOpacity)
	{
		this.fillOpacity = fillOpacity;
		return (T) this;
	}

	public WHighChartChartEventsOptions getEvents()
	{
		if (events == null)
			events = new WHighChartChartEventsOptions();

		return events;
	}

	public AbstractWHighChartPlotChartOptions< ? > setEvents(WHighChartChartEventsOptions events)
	{
		this.events = events;
		return this;
	}

	@SuppressWarnings("unchecked")
	public T setStacking(String stacking)
	{
		this.stacking = stacking;
		return (T) this;
	}

	public String getStacking()
	{
		return stacking;
	}
}
