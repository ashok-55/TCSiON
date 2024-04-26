var user_id = document.getElementById('user_id');
var q1 = document.getElementById('q1');
var q2 = document.getElementById('q2');
var q3 = document.getElementById('q3');
var q4 = document.getElementById('q4');
var q5 = document.getElementById('q5');
var q6 = document.getElementById('q6');
var q7 = document.getElementById('q7');
var q8 = document.getElementById('q8');
var q9 = document.getElementById('q9');
var q10 = document.getElementById('q10');
var comments = document.getElementById('comments');

function submitSurvey() {
  // Create a JSON object with the form data
  const data = {
    user_id: user_id.value,
    q1: q1.value,
    q2: q2.value,
    q3: q3.value,
    q4: q4.value,
    q5: q5.value,
    q6: q6.value,
    q7: q7.value,
    q8: q8.value,
    q9: q9.value,
    q10: q10.value,
    comments: comments.value
  };
  console.log(data);
  // Make a POST request to the backend endpoint
  fetch('http://localhost:8080/api/survey/addresponse', {
    method: 'POST',
    headers: {
      'Content-Type': 'application/json'
    },
    body: JSON.stringify(data)
  })
    .then(function(response) {
      if (response.ok) {
        // The request was successful, so show a success message
        alert('Your survey response has been submitted.');
      } else {
        // The request failed, so show an error message
        alert(' An error has occurred.');
      }
    })
    .catch(function(error) {
      console.log('Error:', error);
      console.log(data);
      // alert('An error has occurred.');
    });
}
