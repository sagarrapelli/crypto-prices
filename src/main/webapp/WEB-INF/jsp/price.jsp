<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<head>
  <style>
    .exp{visibility: hidden;}
    .panel-heading{text-align: center;
                   font-size: 20px; }
  </style>
</head>
<script type="text/javascript">

  function unhide() {
    var hid = document.getElementsByClassName("exp");
    // Emulates jQuery $(element).is(':hidden');
    if(hid[0].offsetWidth > 0 && hid[0].offsetHeight > 0) {
      hid[0].style.visibility = "visible";
    }
  }

</script>
<div class="container">
  <div class="row">
    <div class="col-md-6 col-md-offset-3 ">
     <div class="panel panel-primary">
      <div class="panel-heading">CURRENT PRICES</div>
      <div class="panel-body">

        <table class="table table-striped">
          <thead>
             <tr>
              <th width="40%">Exchange</th>
              <th width="30%">Buy</th>
              <th width="30%">Sell</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${prices}" var="price">
            <tr>
             <td>${price.exchange}</td>
             <td>${price.ask}</td>
             <td>${price.bid}</td>
            </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
      </div>
    </div>
  </div>

  <br>

  <div class="row">
    <div class="text-center">
      <input type="button" onclick="unhide()" value="Get Suggestion" />
    </div>
  </div>

  <br>

  <div class="exp">
    <div class="container">
      <div class="row">
        <div class="col-md-4 col-md-offset-4">
          <div class="jumbotron">
            <h4>Best for buying = ${buy}</h4>
            <h4>Best for selling = ${sell}</h4>
          </div>
        </div>
      </div>
    </div>
  </div>

</div>
<%@ include file="common/footer.jspf"%>