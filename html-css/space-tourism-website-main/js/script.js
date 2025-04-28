console.log("Script loaded");

const setActiveClass = (e, activeE, className) => {
    e.forEach(el => el.classList.remove(className));
    activeE.classList.add(className);
};

const updateNavButton = () => {
    const path = window.location.href;
    homeNavBtn.classList.remove('nav-btn-active');
    if (path.includes("destinations")) {
        setActiveClass([homeNavBtn, destNavBtn, crewNavBtn, techNavBtn], destNavBtn, 'nav-btn-active');
    } else if (path.includes("crew")) {
        setActiveClass([homeNavBtn, destNavBtn, crewNavBtn, techNavBtn], crewNavBtn, 'nav-btn-active');
    } else if (path.includes("technology")) {
        setActiveClass([homeNavBtn, destNavBtn, crewNavBtn, techNavBtn], techNavBtn, 'nav-btn-active');
    } else {
        homeNavBtn.classList.add('nav-btn-active');
    };
};

const toggleBtn = document.getElementById('toggle-ham-menu');
const navList = document.querySelector('.nav-list');

toggleBtn.addEventListener('click', () => {
    navList.style.display = navList.style.display === 'flex' ? 'none' : 'flex';
});


// Navigation bar
const navLinks = document.querySelector('.nav-list');
const hamMenu = document.getElementById('toggle-ham-menu');
const homeNavBtn = document.querySelector('.nav-home');
const destNavBtn = document.querySelector('.nav-destination');
const crewNavBtn = document.querySelector('.nav-crew');   
const techNavBtn = document.querySelector('.nav-technology');

const menu1 = new Image();
menu1.src = '../assets/shared/icon-hamburger.svg';
const menu2 = new Image();
menu2.src = '../assets/shared/icon-close.svg';

hamMenu.innerHTML = '';
let hamMenuIcon = hamMenu.appendChild(menu1);

hamMenu.onclick = () => {
    const isHamburguer = hamMenuIcon.src.includes('icon-hamburger');

    hamMenu.removeChild(hamMenuIcon);
    hamMenuIcon = hamMenu.appendChild(isHamburguer ? menu2 : menu1);

    navLinks.classList.toggle('nav-list-active', isHamburguer);
};

updateNavButton();


// Destination page
window.addEventListener('load', () => {
    const destinations = {
        moon: {
            img: "../assets/destination/image-moon.webp",
            name: "MOON",
            desc: "See our planet as you’ve never seen it before. A perfect relaxing trip away to help regain perspective and come back refreshed. While you’re there, take in some history by visiting the Luna 2 and Apollo 11 landing sites.",
            dist: "384,400 km",
            time: "3 DAYS"
        },
        mars: {
            img: "../assets/destination/image-mars.webp",
            name: "MARS",
            desc: "Don’t forget to pack your hiking boots. You’ll need them to tackle Olympus Mons, the tallest planetary mountain in our solar system. It’s two and a half times the size of Everest!",
            dist: "225 MIL. km",
            time: "9 MONTHS"
        },
        europa: {
            img: "../assets/destination/image-europa.webp",
            name: "EUROPA",
            desc: "The smallest of the four Galilean moons orbiting Jupiter, Europa is a winter lover’s dream. With an icy surface, it’s perfect for a bit of ice skating, curling, hockey, or simple relaxation in your snug wintery cabin.",
            dist: "628 MIL. km",
            time: "3 YEARS"
        },
        titan: {
            img: "../assets/destination/image-titan.webp",
            name: "TITAN",
            desc: "The only moon known to have a dense atmosphere other than Earth, Titan is a home away from home (just a few hundred degrees colder!). As a bonus, you get striking views of the Rings of Saturn.",
            dist: "1.6 BIL. km",
            time: "7 YEARS"
        }
    };

    const planet = document.querySelector('.planet');
    const planetName = document.querySelector('.planet-name');
    const planetDesc = document.querySelector('.description');
    const distance = document.querySelector('.km');
    const travelTime = document.querySelector('.time');

    const btns = ['moon', 'mars', 'europa', 'titan'].map(id => document.getElementById(`${id}-btn`));

    btns.forEach(btn => {
        btn?.addEventListener("click", () => {
            const key = btn.id.replace('-btn', '');
            const data = destinations[key];
            if (!data) return;
            planet.src = data.img;
            planetName.textContent = data.name;
            planetDesc.textContent = data.desc;
            distance.textContent = data.dist;
            travelTime.textContent = data.time;

            setActiveClass(btns, btn, "planet-navbar-active");
        });
    });

    if (btns[0]) btns[0].click(); 
});

// Crew page
window.addEventListener('load', () => {
    const crewData = [
        {
            img: "../assets/crew/image-douglas-hurley.webp",
            position: "commander",
            name: "Douglas Hurley",
            desc: "Douglas Gerald Hurley is an American engineer, former Marine Corps pilot and former NASA astronaut. He launched into space for the third time as commander of Crew Dragon Demo-2."
        },
        {
            img: "../assets/crew/image-mark-shuttleworth.webp",
            position: "Mission Specialist",
            name: "Mark Shuttleworth",
            desc: "Mark Richard Shuttleworth is the founder and CEO of Canonical, the company behind the Linux-based Ubuntu operating system. Shuttleworth became the first South African to travel to space as a space tourist."
        },
        {
            img: "../assets/crew/image-victor-glover.webp",
            position: "Pilot",
            name: "Victor Glover",
            desc: "Pilot on the first operational flight of the SpaceX Crew Dragon to the International Space Station. Glover is a commander in the U.S. Navy where he pilots an F/A-18.He was a crew member of Expedition 64, and served as a station systems flight engineer."
        },
        {
            img: "../assets/crew/image-anousheh-ansari.webp",
            position: "Flight Engineer",
            name: "Anousheh Ansari",
            desc: "Anousheh Ansari is an Iranian American engineer and co-founder of Prodea Systems. Ansari was the fourth self-funded space tourist, the first self-funded woman to fly to the ISS, and the first Iranian in space."
        }
    ];

    const crewNavs = crewData.map((_, i) => document.getElementById(`nav-c${i + 1}`));
    const crewImg = document.querySelector('.crew-img');
    const crewPosition = document.querySelector('.position');
    const crewName = document.querySelector('.crew-name');
    const crewDesc = document.querySelector('.crew-desc');

    crewNavs.forEach((btn, i) => {
        btn?.addEventListener("click", () => {
            const data = crewData[i];
            crewImg.src = data.img;
            crewPosition.textContent = data.position;
            crewName.textContent = data.name;
            crewDesc.textContent = data.desc;

            setActiveClass(crewNavs, btn, "nav-circles-active");
        });
    });

    crewNavs[0].click(); // Set default active button
});

// Technology page
window.addEventListener('load', () => {
    const techImage = document.querySelector('.tech-img');
    const techMain = document.querySelector('.sec-tittle');
    const techDesc = document.querySelector('.description');
    const techBtns = [1, 2, 3].map(i => document.getElementById(`num${i}`));

    const techData = [
        {
            name: "Launch Vehicle",
            desc: "A launch vehicle or carrier rocket is a rocket-propelled vehicle used to carry a payload from Earth's surface to space, usually to Earth orbit or beyond. Our WEB-X carrier rocket is the most powerful in operation. Standing 150 metres tall, it's quite an awe-inspiring sight on the launch pad!",
            portrait: "image-launch-vehicle-portrait.jpg",
            landscape: "image-launch-vehicle-landscape.jpg"
        },
        {
            name: "Spaceport",
            desc: "A spaceport or cosmodrome is a site for launching (or receiving) spacecraft, by analogy to the seaport for ships or airport for aircraft. Based in the famous Cape Canaveral, our spaceport is ideally situated to take advantage of the Earth’s rotation for launch.",
            portrait: "image-spaceport-portrait.jpg",
            landscape: "image-spaceport-landscape.jpg"
        },
        {
            name: "Space Capsule",
            desc: "A space capsule is an often-crewed spacecraft that uses a blunt-body reentry capsule to reenter the Earth's atmosphere without wings. Our capsule is where you'll spend your time during the flight. It includes a space gym, cinema, and plenty of other activities to keep you entertained.",
            portrait: "image-space-capsule-portrait.jpg",
            landscape: "image-space-capsule-landscape.jpg"
        }
    ];

    const getImage = (portrait, landscape) => {
        const width = window.innerWidth;
        const filename = width >= 1280 ? portrait : landscape;
        return `../assets/technology/${filename}`;
    };

    techBtns.forEach((btn, i) => {
        if (btn) {
            btn.addEventListener("click", () => {
                const tech = techData[i];
                if (techImage) {
                    techImage.src = getImage(tech.portrait, tech.landscape);
                }
                if (techMain) techMain.textContent = tech.name;
                if (techDesc) techDesc.textContent = tech.desc;
    
                setActiveClass(techBtns, btn, "num-active");
            });
        }
    });    

    if (techBtns[0]) techBtns[0].click(); // Safe default
});

console.log("Script running complete");
