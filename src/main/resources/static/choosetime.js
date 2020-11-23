var start = document.getElementById("start").value;
var end = document.getElementById("end").value;

document.getElementById("start").onchange = function() {diff(start,end)};
document.getElementById("end").onchange = function() {diff(start,end)};


function diff(start, end) {
    start = document.getElementById("start").value;
    end = document.getElementById("end").value;

    start = start.split(":");
    end = end.split(":");
    var startDate = new Date(0, 0, 0, start[0], start[1], 0);
    var endDate = new Date(0, 0, 0, end[0], end[1], 0);
    var diff = endDate.getTime() - startDate.getTime();
    var hours = Math.floor(diff / 1000 / 60 / 60);
    diff -= hours * 1000 * 60 * 60;
    var minutes = Math.floor(diff / 1000 / 60);

    return (hours < 9 ? "0" : "") + hours + ":" + (minutes < 9 ? "0" : "") + minutes;
}

setInterval(function(){document.getElementById("diff").value = diff(start, end);}, 1000);


 $(document).ready(function(){
    $('#purpose').on('change', function() {
      if ( this.value == '1')
      //.....................^.......
      {
           $("#business_new").hide();
        $("#business").show();
      }
      else  if ( this.value == '2')
      {
          $("#business").hide();
        $("#business_new").show();
      }
       else
      {
        $("#business").hide();
      }
    });
});


 $(function ()
    {
        $("#diapersForm").on('submit', function ()
        {
            if (document.getElementById("chbox").checked)
            {
                $("#diapersForm").submit();
            }
            else
            {
                e.preventDefault();
                alert('Please check the box before submitting the form');
            }
        });
    });

$("#bologna-list a").on("click", function (e) {
  e.preventDefault();
  $(this).tab("show");
});