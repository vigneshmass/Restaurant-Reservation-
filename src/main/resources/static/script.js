function loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
    .then((res) => res.json()).then(posts => {
        let output = '';
        posts.map(p => {
            document.getElementById('posts').innerHTML += `
                <h1>${p.title}</h1>
                <p>${p.body}</p>
            `;
            console.log(p.title);
        });
        // window.location.href = "http://www.w3schools.com";
    })
    .catch((err) => {
        console.log(err);
    });
}
















<div id='hotels'></div>
<script type="text/javascript">
var mywindow;

  function loadPosts(id) {
    // console.log(id);
    //mywindow=window.open("","mywindow","width=1000,height=1000");
    fetch(`http://localhost:8080/api/rest/${id}`)
      .then((res) => res.json()).then(h => {
        console.log(h);
        let output = '';
        document.write(
          output += `
                <h1>${h. restName}</h1>
                <p>${h.restAddress}</p>
                <p>${h.restType}</p>



                <table class="table">
                  <tr>
                    <th>country</th>
                    <th>city</th>
                    <th>managerName</th>
                    <th>phoneno</th>
                    <th>email</th>
                    <th>website</th>
                    <th>facility</th>
                    <th>zipcode</th>
                      </tr>
                   <tr>
                    <td>${h.country}</td>
                    <td>${h.city}</td>
                    <td>${h.managerName}</td>
                    <td>${h.phoneno}</td>
                    <td>${h.email}</td>
                    <td>${h.website}</td>
                    <td>${h.facility}</td>
                    <td>${h.zipcode}</td>
                      </tr>
                    </table>

                    
          `);
        
        //document.getElementById('hotels').innerHTML = output;
         
      })
      .catch((err) => {
        console.log(err);
      });
  }
</script>
