package functions;

// POJO for emitted cloud event for Attack/Score
public class MessageOutput
{
  private String _game = null;
  private String _match = null;
  private String _uuid = null;
  private Integer _delta = 0;
  private Long _ts;
  private boolean _human = false;
  
  // Setters
  public void setGame( String game ) { _game = game; }
  public void setMatch( String match ) { _match = match; }
  public void setUuid( String uuid ) { _uuid = uuid; }
  public void setTs( Long ts ) { _ts = ts; }
  public void setHuman( boolean human ) { _human = human; }
  public void setDelta( Integer delta ) { _delta = delta; }
  
  // Accessors
  public String getGame() { return _game; }
  public String getMatch() { return _match; }
  public String getUuid() { return _uuid; }
  public Long getTs() { return _ts; }
  public Integer getDelta() { return _delta; }
  public boolean getHuman() { return _human; }
}