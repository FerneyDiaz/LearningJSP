function validateForm(form){
    var user = form.txtUser;
    var pass = form.txtPassword;
    var technologies = form.technology;
    var checkSelected = false;
    var gender = form.gender;
    var radioSelected = false;
    var occupation = form.slcOccupation;
    if (user.value == "") {
        alert("User field is obligatory");
        user.focus();
        user.select();
        return false;
    }if (pass.value == "" || pass.value.length < 3) {
            alert("Password field is null or its lenght is less than 3, please fill out some password");
            pass.focus();
            pass.select();
            return false;
    }
    for (var i = 0; i < technologies.length; i++) {
        if (technologies[i].checked) {
            checkSelected = true;
            break;
        }
    }
    if (!checkSelected) {
        alert("You must select some technology");
        return false;
    }
    for (var i = 0; i < gender.length; i++) {
        if (gender[i].checked) {
            radioSelected = true;
        }
    }
    if (!radioSelected) {
        alert("You must select some gender");
        return false;
    }
    if (occupation.value == "") {
        alert("You must select an occupation");
        return false;
    }
    alert("Form filled out successfully");
    return true;
}